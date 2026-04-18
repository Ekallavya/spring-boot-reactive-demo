package com.universe.bluestone.threadpool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SumArrayRecursiveTask extends RecursiveTask<Long> {
    private static final int THRESHOLD = 10_000; // Threshold for direct computation
    private final long[] array;
    private final int start;
    private final int end;

    public SumArrayRecursiveTask(long[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if (end - start <= THRESHOLD) {
            // Base case: the task is small enough, compute the sum directly
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            return sum;
        } else {
            // Recursive case: the task is too large, split it
            int mid = start + (end - start) / 2;
            SumArrayRecursiveTask leftTask = new SumArrayRecursiveTask(array, start, mid);
            SumArrayRecursiveTask rightTask = new SumArrayRecursiveTask(array, mid, end);

            // Fork the left task to run asynchronously
            leftTask.fork();

            // Compute the right task in the current thread (or split further)
            long rightResult = rightTask.compute();

            // Join the result from the left task
            long leftResult = leftTask.join();

            // Combine the results
            return leftResult + rightResult;
        }
    }
}

public class ForkJoinPoolDemo {
    public static void main(String[] args) {
        // Create a large array
        long[] array = new long[100_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // Create a ForkJoinPool
        // Using commonPool() is a good default for most applications
        ForkJoinPool pool = ForkJoinPool.commonPool();

        // Create the main task that represents all the work
        SumArrayRecursiveTask mainTask = new SumArrayRecursiveTask(array, 0, array.length);

        // Run the task and get the result
        long result = pool.invoke(mainTask);

        System.out.println("Sum of array elements: " + result);
    }
}
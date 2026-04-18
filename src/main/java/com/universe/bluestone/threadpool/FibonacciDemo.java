package com.universe.bluestone.threadpool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class FibonacciDemo extends RecursiveTask<Long> {

    private volatile long number;

    public FibonacciDemo(long number) {
        this.number = number;
    }

    @Override
    protected Long compute() {
        long n = number;
        if (n <= 10) {
            number = fib(n);
        } else {
            FibonacciDemo f1 = new FibonacciDemo(n - 1);
            FibonacciDemo f2 = new FibonacciDemo(n - 2);
            ForkJoinTask.invokeAll(f1, f2);
            number = f1.number + f2.number;
        }
        return number;
    }

    private static long fib(long n) {
        if (n <= 1) return n;
        else return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        FibonacciDemo task = new FibonacciDemo(50);
        System.out.println(new ForkJoinPool().invoke(task));
    }
}
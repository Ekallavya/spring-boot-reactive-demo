package com.universe.bluestone.java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAdder;

public class LongAdderExample {
    public static void main(String[] args) throws InterruptedException {
        // Initialize an adder with a starting sum of zero
        LongAdder counter = new LongAdder();

        // Spin up a pool of threads
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 1000; i++) {
            executor.submit(() -> {
                // Thread-safe increments (equivalent to add(1))
                System.out.println(Thread.currentThread().getName());
                counter.increment();
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        // Sum up all distributed values
        System.out.println("Final Sum: " + counter.sum()); 
    }
}
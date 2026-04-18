package com.universe.bluestone.threadpool;

public class FixedThreadPoolDemo {
    public static void main(String[] args) {
        // Create a fixed thread pool with 3 threads
        java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(3);

        // Submit tasks to the executor
        for (int i = 1; i <= 10; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // Simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // Shutdown the executor
        executor.shutdown();
    }
}

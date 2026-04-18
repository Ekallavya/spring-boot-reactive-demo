package com.universe.bluestone.threadpool;

public class SingleThreadExecutorDemo {
    public static void main(String[] args) {
        java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newSingleThreadExecutor();

        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " is running in thread " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}

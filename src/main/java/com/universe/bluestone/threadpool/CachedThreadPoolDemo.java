package com.universe.bluestone.threadpool;

public class CachedThreadPoolDemo {
    public static void main(String[] args) {
        java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            Runnable task = () -> {
                System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
            };
            executor.execute(task);

        }
        executor.shutdown();
    }
}

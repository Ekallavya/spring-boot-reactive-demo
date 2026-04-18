package com.universe.bluestone.threadpool;

public class ScheduledThreadPoolDemo {
    public static void main(String[] args) {
        // Create a scheduled thread pool with 2 threads
        java.util.concurrent.ScheduledExecutorService scheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(2);

        // Schedule a task to run after a delay of 3 seconds
        scheduledThreadPool.schedule(() -> {
            System.out.println("Task executed after 3 seconds");
        }, 3, java.util.concurrent.TimeUnit.SECONDS);

        // Schedule a task to run at a fixed rate of 5 seconds
        scheduledThreadPool.scheduleAtFixedRate(() -> {
            System.out.println("Task executed at a fixed rate of 5 seconds");
        }, 0, 5, java.util.concurrent.TimeUnit.SECONDS);

        // Schedule a task to run with a fixed delay of 4 seconds
        scheduledThreadPool.scheduleWithFixedDelay(() -> {
            System.out.println("Task executed with a fixed delay of 4 seconds");
        }, 0, 4, java.util.concurrent.TimeUnit.SECONDS);

        // Keep the main thread alive for some time to observe the scheduled tasks
        try {
            Thread.sleep(20000); // Sleep for 20 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Shutdown the scheduled thread pool
        scheduledThreadPool.shutdown();
    }
}

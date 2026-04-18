package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CancelDemo {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000); // Simulate long-running task
            } catch (InterruptedException e) {
                return "Task was interrupted";
            }
            return "Task completed";
        });

        // Cancel the future after 1 second
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean cancelled = future.cancel(true);
        System.out.println("Future cancelled: " + cancelled);

        // Check if the future is completed or canceled
        System.out.println("Future is done: " + future.isDone());
        System.out.println("Future is cancelled: " + future.isCancelled());
    }
}

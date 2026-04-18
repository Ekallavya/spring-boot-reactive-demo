package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class RunAfterEitherAsyncDemo {
    public static void main(String[] args) {
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(2000); // Simulate a long-running task
                System.out.println("Future 1 completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(3000); // Simulate a longer-running task
                System.out.println("Future 2 completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        future1.runAfterEitherAsync(future2, () -> {
            System.out.println("One of the futures has completed. Running this task.");
        });

        // Wait for both futures to complete
        future1.join();
        future2.join();
    }
}

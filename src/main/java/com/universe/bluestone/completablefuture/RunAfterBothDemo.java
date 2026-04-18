package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class RunAfterBothDemo {
    public static void main(String[] args) {
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(1000); // Simulate some work
                System.out.println("Future 1 completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(1500); // Simulate some work
                System.out.println("Future 2 completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        future1.runAfterBoth(future2, () -> {
            System.out.println("Both futures completed. Running this task.");
        });

        // Wait for the combined future to complete
        future1.join();
    }
}

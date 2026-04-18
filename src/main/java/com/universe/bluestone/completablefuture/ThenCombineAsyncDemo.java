package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ThenCombineAsyncDemo {
    public static void main(String[] args) {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000); // Simulate a long-running task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 10;
        });

        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1500); // Simulate a longer-running task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 20;
        });

        CompletableFuture<Integer> combinedFuture = future1.thenCombineAsync(future2, (result1, result2) -> {
            return result1 + result2; // Combine results by summing them
        });

        combinedFuture.thenAccept(result -> {
            System.out.println("Combined Result: " + result); // Should print 30
        });

        // Wait for the combined future to complete before exiting the main thread
        combinedFuture.join();
    }
}

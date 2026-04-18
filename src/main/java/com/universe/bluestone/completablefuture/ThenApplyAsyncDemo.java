package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ThenApplyAsyncDemo {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            // Simulate a long-running task
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello";
        }).thenApplyAsync(result -> {
            // Process the result of the previous stage
            return result + " World!";
        }).thenAcceptAsync(finalResult -> {
            // Consume the final result
            System.out.println(finalResult);
        });

        // Keep the main thread alive to see the output
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

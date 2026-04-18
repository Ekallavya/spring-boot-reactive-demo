package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ThenApplyDemo {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            // Simulate a long-running task
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello";
        }).thenApply(result -> {
            // Transform the result
            return result + " World!";
        }).thenAccept(finalResult -> {
            // Consume the final result
            System.out.println(finalResult);
        });

        // Keep the main thread alive to see the result
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

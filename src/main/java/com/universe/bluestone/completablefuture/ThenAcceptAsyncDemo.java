package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ThenAcceptAsyncDemo {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            // Simulate a long-running task
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello, World!";
        }).thenAcceptAsync(result -> {
            // This will be executed after the supplyAsync task is completed
            System.out.println("Result: " + result);
        });

        // Keep the main thread alive to see the result
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ThenComposeAsyncDemo {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            // Simulate a long-running task
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello";
        }).thenComposeAsync(result -> {
            // Simulate another long-running task that depends on the first result
            return CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return result + " World!";
            });
        }).thenAccept(finalResult -> {
            System.out.println(finalResult); // Output: Hello World!
        });

        // Keep the main thread alive to see the result
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

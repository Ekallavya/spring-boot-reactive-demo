package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ThenAcceptBothDemo {
    public static void main(String[] args) {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            // Simulate some asynchronous computation
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            // Simulate some asynchronous computation
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "World";
        });

        future1.thenAcceptBoth(future2, (result1, result2) -> {
            System.out.println(result1 + " " + result2);
        });

        // Wait for the futures to complete
        try {
            Thread.sleep(3000); // Wait for enough time to let both futures complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

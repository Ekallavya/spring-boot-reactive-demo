package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ThenAcceptBothAsyncDemo {
    public static void main(String[] args) {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000); // Simulate a long-running task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1500); // Simulate a longer-running task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "World";
        });

        future1.thenAcceptBothAsync(future2, (result1, result2) -> {
            System.out.println("Result from Future 1: " + result1);
            System.out.println("Result from Future 2: " + result2);
            System.out.println("Combined Result: " + result1 + " " + result2);
        });

        // Wait for the asynchronous tasks to complete
        try {
            Thread.sleep(3000); // Wait enough time for both futures to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

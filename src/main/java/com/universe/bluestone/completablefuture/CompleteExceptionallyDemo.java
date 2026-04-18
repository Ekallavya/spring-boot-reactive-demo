package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompleteExceptionallyDemo {
    public static void main(String[] args) {
        CompletableFuture<String> future = new CompletableFuture<>();

        // Simulate an asynchronous task that encounters an exception
        new Thread(() -> {
            try {
                Thread.sleep(1000); // Simulate some work
                throw new RuntimeException("Something went wrong!");
            } catch (Exception e) {
                future.completeExceptionally(e); // Complete the future exceptionally
            }
        }).start();

        // Handle the result or exception
        future.whenComplete((result, exception) -> {
            if (exception != null) {
                System.out.println("Error: " + exception.getMessage());
            } else {
                System.out.println("Result: " + result);
            }
        });
    }
}

package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

public class ExceptionallyComposeAsyncDemo {

    private static final ExecutorService executor = Executors.newFixedThreadPool(5);

    // Primary asynchronous service that sometimes fails
    public static CompletableFuture<String> primaryService() {
        return CompletableFuture.supplyAsync(() -> {
            if (ThreadLocalRandom.current().nextBoolean()) {
                throw new RuntimeException("Primary service failed!");
            }
            return "Result from Primary Service";
        }, executor);
    }

    // Secondary asynchronous fallback service
    public static CompletableFuture<String> fallbackService(Throwable ex) {
        System.out.println("--- Executing Fallback Service (in " + Thread.currentThread().getName() + ") due to: " + ex.getMessage() + " ---");
        // Simulate a network call or some other asynchronous operation
        return CompletableFuture.supplyAsync(() -> "Result from Fallback Service", executor);
    }

    public static void main(String[] args) {
        CompletableFuture<String> resultFuture = primaryService()
            .exceptionallyComposeAsync(ex -> {
                // This block is executed in the executor's thread
                return fallbackService(ex);
            }, executor);

        // Wait for the final result and print it
        try {
            String result = resultFuture.join();
            System.out.println("Final Result: " + result);
        } catch (Exception e) {
            System.err.println("Operation failed completely: " + e.getMessage());
        } finally {
            executor.shutdown();
        }
    }
}
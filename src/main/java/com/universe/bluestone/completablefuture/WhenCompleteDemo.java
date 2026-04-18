package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class WhenCompleteDemo {

    public static void main(String[] args) {
        // --- Example 1: Successful completion ---
        CompletableFuture<String> successFuture = CompletableFuture.supplyAsync(() -> {
            // Simulate a task that returns a value
            return "Task Result: Success!";
        });

        successFuture.whenComplete((result, exception) -> {
            if (exception != null) {
                System.out.println("Success Case - Error: " + exception.getMessage());
            } else {
                System.out.println("Success Case - Result: " + result);
            }
        });

        // --- Example 2: Exceptional completion ---
        CompletableFuture<String> exceptionFuture = CompletableFuture.supplyAsync(() -> {
            // Simulate a task that throws an exception
            throw new RuntimeException("Something went wrong!");
        });

        exceptionFuture.whenComplete((result, exception) -> {
            if (exception != null) {
                // The exception here will be a CompletionException wrapping the original RuntimeException
                System.out.println("Exception Case - Error: " + exception.getCause().getMessage());
            } else {
                System.out.println("Exception Case - Result: " + result);
            }
        });

        // Use join() to wait for the futures to complete in a simple main method example
        // (In a real application, you would not typically block the main thread this way)
        try {
            successFuture.join();
            exceptionFuture.join();
        } catch (Exception e) {
            // Handle potential exceptions if join() throws one (e.g. the underlying exception)
            // whenComplete handles it internally, so this might not be reached depending on implementation
        }
    }
}
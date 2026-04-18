package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class ResultNowDemo {

    public static void main(String[] args) {

        // --- Example 1: Future is already completed ---
        CompletableFuture<String> completedFuture = CompletableFuture.completedFuture("Hello, World!");
        
        // getNow() returns the actual result because the future is done
        String result1 = completedFuture.getNow("Default Value"); 
        System.out.println("Result 1 (Completed): " + result1); // Output: Hello, World!

        // --- Example 2: Future is incomplete ---
        CompletableFuture<String> incompleteFuture = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5); // Simulate a long-running task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "I am done";
        });

        // getNow() returns the 'valueIfAbsent' because the future is not yet done
        String result2 = incompleteFuture.resultNow();
        System.out.println("Result 2 (Incomplete): " + result2); // Output: Default Value
        
        // Wait for the second future to complete to allow the program to exit gracefully
        try {
            incompleteFuture.join(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
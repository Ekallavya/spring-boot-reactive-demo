package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ApplyToEitherAsyncDemo {
    public static void main(String[] args) {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000); // Simulate a long-running task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Result from Future 1";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000); // Simulate a shorter task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Result from Future 2";
        });

        future1.applyToEitherAsync(future2, result -> {
            System.out.println("Received: " + result);
            return result;
        }).join(); // Wait for the result to be printed

        CompletableFuture<String> applyEitherResult=future1.applyToEitherAsync(future2, result -> {
            System.out.println("Received: " + result);
            return result;
        });
        applyEitherResult.thenAccept(result -> System.out.println("Processed result: " + result));
    }


}

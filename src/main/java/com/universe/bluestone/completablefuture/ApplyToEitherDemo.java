package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ApplyToEitherDemo {
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

        future1.applyToEither(future2, result -> "Processed: " + result)
               .thenAccept(System.out::println);

        // Keep the main thread alive to see the result
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

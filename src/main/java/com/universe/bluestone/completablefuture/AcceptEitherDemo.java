package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class AcceptEitherDemo {
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

        future1.acceptEither(future2, result -> {
            System.out.println("Received: " + result);
        });

        // Wait for the futures to complete
        try {
            Thread.sleep(3000); // Wait longer than the longest task
        } catch (InterruptedException e) {
            throw  new RuntimeException(e);
        }
    }
}

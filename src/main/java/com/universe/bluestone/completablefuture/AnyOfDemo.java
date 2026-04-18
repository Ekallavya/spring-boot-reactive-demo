package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class AnyOfDemo {
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

            CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(3000); // Simulate a longer task
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "Result from Future 3";
            });

            CompletableFuture<Object> anyOfFuture = CompletableFuture.anyOf(future1, future2, future3);

            anyOfFuture.thenAccept(result -> System.out.println("First completed result: " + result));

            // Wait for the anyOfFuture to complete before exiting the main thread
            anyOfFuture.join();
    }
}

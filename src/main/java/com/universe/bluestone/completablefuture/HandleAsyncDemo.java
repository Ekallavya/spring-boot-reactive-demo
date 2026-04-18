package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class HandleAsyncDemo {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            if (Math.random() > 0.5) {
                throw new RuntimeException("Something went wrong!");
            }
            return "Hello, World!";
        }).handleAsync((result, ex) -> {
            if (ex != null) {
                System.out.println("Handled exception: " + ex.getMessage());
                return "Default Value";
            }
            return result;
        }).thenAcceptAsync(result -> System.out.println("Result: " + result));

        // Sleep to allow async tasks to complete
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class IsCompletedExceptionallyDemo {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            throw new RuntimeException("Something went wrong!");
        });

        // Check if the future completed exceptionally
        boolean isExceptionallyCompleted = future.isCompletedExceptionally();
        System.out.println("Is the future completed exceptionally? " + isExceptionallyCompleted);
    }
}

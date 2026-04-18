package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class AllOfDemo {
    public static void main(String[] args) {
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            // Simulate some work
            try {
                Thread.sleep(1000);
                System.out.println("Task 1 completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
            // Simulate some work
            try {
                Thread.sleep(1500);
                System.out.println("Task 2 completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        CompletableFuture<Void> future3 = CompletableFuture.runAsync(() -> {
            // Simulate some work
            try {
                Thread.sleep(2000);
                System.out.println("Task 3 completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Wait for all tasks to complete
        CompletableFuture<Void> allOf = CompletableFuture.allOf(future1, future2, future3);
        allOf.join(); // Waits for all tasks to complete
        if (allOf.isDone()) {
            System.out.println("All tasks completed");
        }
    }
}

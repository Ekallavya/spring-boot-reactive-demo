package com.universe.bluestone.completablefuture;

public class SupplyAsyncDemo {
    public static void main(String[] args) {
        // Using supplyAsync to run a task that returns a result
        var future = java.util.concurrent.CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000); // Simulate a long-running task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello, World!";
        });

        // Do other tasks while the async task is running
        System.out.println("Doing other work...");

        // Get the result of the async task
        String result = future.join(); // This will block until the result is available
        System.out.println("Result from async task: " + result);
    }
}

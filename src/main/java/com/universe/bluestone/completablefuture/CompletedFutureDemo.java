package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletedFutureDemo {
    public static void main(String[] args) {

        // Create a completed CompletableFuture with a result
        CompletableFuture<String> completedFuture = CompletableFuture.completedFuture("Hello, World!");

        // Retrieve the result from the completed future
        String result = completedFuture.join(); // join() will return the result immediately since it's already completed

        // Print the result
        System.out.println(result);

        CompletableFuture<String> cf = CompletableFuture.completedFuture("Txn Successfully completed.");

        if (cf.isDone()){
            System.out.println(cf.getNow(null));
            System.out.println("CompletedFuture is done.");
        }

    }
}

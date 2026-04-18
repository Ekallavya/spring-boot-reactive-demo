package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ExceptionallyDemo {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            if ("India".indexOf("I")==0){
                throw new RuntimeException("Something went wrong!");
            }
            return "Hello, World!";
        }).exceptionally(ex -> {
            System.out.println("Caught exception: " + ex.getMessage());
            return "Default Value";
        }).thenAccept(result -> {
            System.out.println("Result: " + result);
        });
    }
}

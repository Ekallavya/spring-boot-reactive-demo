package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class HandleDemo {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            if (Math.random() > 0.5) {
                throw new RuntimeException("Something went wrong!");
            }
            return "Hello, World!";
        }).handle((result, ex) -> {
            if (ex != null) {
                System.out.println("Error: " + ex.getMessage());
                return "Default Value";
            }
            return result;
        }).thenAccept(System.out::println);
    }
}

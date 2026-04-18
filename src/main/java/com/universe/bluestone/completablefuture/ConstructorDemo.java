package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ConstructorDemo {
    public static void main(String[] args) {
        CompletableFuture<String> cf  = new CompletableFuture<>();
        cf.complete("Hello, World!");
        // join() will block the main thread until the CompletableFuture is completed and return the result
        System.out.println(cf.join());


    }
}

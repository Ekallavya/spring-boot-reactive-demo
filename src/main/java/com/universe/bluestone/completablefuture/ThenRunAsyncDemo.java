package com.universe.bluestone.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ThenRunAsyncDemo {
    public static void main(String[] args) {
        CompletableFuture.runAsync(() -> {
            System.out.println("Running first task in thread: " + Thread.currentThread().getName());
        }).thenRunAsync(() -> {
            System.out.println("Running second task in thread: " + Thread.currentThread().getName());
        });

        // Sleep the main thread to allow async tasks to complete
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

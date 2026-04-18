package com.universe.bluestone.threadpool;

import java.util.concurrent.Executors;
public class VirtualThreadsDemo {
    public static void main(String[] args) {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            executor.submit(() -> {
                System.out.println("Hello from a virtual thread! Thread: " + Thread.currentThread());
            });
        }
    }
}
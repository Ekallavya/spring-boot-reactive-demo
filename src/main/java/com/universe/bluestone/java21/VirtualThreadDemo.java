package com.universe.bluestone.java21;

import java.time.Duration;

public class VirtualThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread.startVirtualThread(() -> {
            System.out.println("Hello from a virtual thread!");
        });

        Thread.sleep(Duration.ofSeconds(1));// Sleep to allow the virtual thread to complete before the main thread exits
    }
}

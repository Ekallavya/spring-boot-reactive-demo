package com.universe.bluestone.reactive.mono;

import reactor.core.publisher.Mono;

public class MonoFromRunnableDemo {
    public static void main(String[] args) {
        // Create a Mono from a Runnable
        Mono<Void> monoFromRunnable = Mono.fromRunnable(() -> {
            System.out.println("Executing a task in Mono.fromRunnable");
            // Simulate some work
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Task completed");
        });

        // Subscribe to the Mono to execute the Runnable
        monoFromRunnable.subscribe(
                null, // No value emitted
                error -> System.err.println("Error: " + error),
                () -> System.out.println("Mono.fromRunnable completed")
        );
    }
}

package com.universe.bluestone.reactive.mono;

import reactor.core.publisher.Mono;

public class MonoFromCallableDemo {
    public static void main(String[] args) {
        // Create a Mono from a Callable that simulates a time-consuming operation
        Mono<String> monoFromCallable = Mono.fromCallable(() -> {
            Thread.sleep(2000); // Simulate delay
            return "Hello from Callable!";
        });

        // Subscribe to the Mono and print the result
        monoFromCallable.subscribe(result -> System.out.println("Received: " + result));

        // Keep the main thread alive to see the result
        try {
            Thread.sleep(3000); // Wait longer than the Callable's sleep to ensure we see the output
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
    }
}

package com.universe.bluestone.reactive.mono;

import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

public class MonoFromFutureDemo {
    public static void main(String[] args) {
            // Create a CompletableFuture that completes with a value
            CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(1000); // Simulate some delay
                } catch (InterruptedException e) {
                   throw new RuntimeException(e);
                }
                return "Hello from CompletableFuture!";
            });

            // Create a Mono from the CompletableFuture
            Mono<String> monoFromFuture = Mono.fromFuture(future);

            // Subscribe to the Mono and print the emitted value
            monoFromFuture.subscribe(System.out::println);

            // Keep the main thread alive to see the result
            try {
                Thread.sleep(2000); // Wait for the CompletableFuture to complete
            } catch (InterruptedException e) {
               throw new RuntimeException(e);
            }
    }
}

package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

public class FluxRetryExample {
    public static void main(String[] args) {
        Flux<String> unreliableSource = Flux.defer(() -> {
            // Simulate an operation that fails randomly
            if (Math.random() < 0.7) {
                return Flux.error(new RuntimeException("Transient error"));
            }
            return Flux.just("Success");
        });

        unreliableSource
                .doOnSubscribe(s -> System.out.println("Subscribing..."))
                .retry(3) // Retries 3 times (total 4 attempts)
                .subscribe(
                        data -> System.out.println("Received: " + data),
                        error -> System.err.println("Error after retries: " + error.getMessage())
                );
    }
}

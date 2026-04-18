package com.universe.bluestone.reactive.mono;

import reactor.core.publisher.Mono;

public class MonoNeverDemo {
    public static void main(String[] args) {
        // Create a Mono that never emits any item and never completes
        Mono<String> neverMono = Mono.never();

        // Subscribe to the Mono
        neverMono.subscribe(
                item -> System.out.println("Received: " + item), // onNext
                error -> System.err.println("Error: " + error), // onError
                () -> System.out.println("Completed") // onComplete
        );

        // Since Mono.never() never emits or completes, the above subscription will not print anything.
    }
}

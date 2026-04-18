package com.universe.bluestone.reactive.mono;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFromDirectDemo {
    public static void main(String[] args) {
        // A publisher emitting multiple items
        Flux<Integer> integerFlux = Flux.just(1, 2, 3, 4, 5);

        // Convert the Publisher to a Mono using fromDirect()
        // Takes only the first element (1) and cancels the source
        Mono<Integer> mono = Mono.fromDirect(integerFlux);

        // Subscribe to the Mono
        mono.subscribe(
                value -> System.out.println("Received: " + value),
                error -> System.err.println("Error: " + error),
                () -> System.out.println("Completed")
        );
        // Output:
        // Received: 1
        // Completed
    }
}

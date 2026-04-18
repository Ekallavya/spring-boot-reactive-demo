package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxSingleExample {
    public static void main(String[] args) {
        // Example 1: Flux emits exactly one item (expected behavior for single())
        Flux<String> oneItemFlux = Flux.just("Hello");

        Mono<String> singleMono = oneItemFlux.single();

        singleMono.subscribe(
                value -> System.out.println("Single value: " + value), // onNext
                error -> System.err.println("Error: " + error.getMessage())  // onError
        );

        // Example 2: Flux emits multiple items (will result in an error)
        Flux<String> multiItemFlux = Flux.just("A", "B", "C", "D");
        Mono<String> multiMono = multiItemFlux.single();

        multiMono.subscribe(
                value -> System.out.println("Single value: " + value),
                error -> System.err.println("Error for multi-item flux: " + error.getMessage()) // Will print an error
        );

        // Example 3: Flux emits no items (will result in an error)
        Flux<String> emptyFlux = Flux.empty();
        Mono<String> emptyMono = emptyFlux.singleOrEmpty();

        emptyMono.subscribe(
                value -> System.out.println("Single value: " + value),
                error -> System.err.println("Error for empty flux: " + error.getMessage()) // Will print an error
        );

        // Example 4: Flux emits no items (will result in an error)
        Flux<String> emptyFlux1 = Flux.empty();
        Mono<String> emptyMono1 = emptyFlux1.single("Y");

        emptyMono1.subscribe(
                value -> System.out.println("Single value: " + value),
                error -> System.err.println("Error for empty flux: " + error.getMessage()) // Will print an error
        );
    }
}
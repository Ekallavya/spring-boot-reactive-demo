package com.universe.bluestone.reactive.mono;

import reactor.core.publisher.Mono;

public class MonoJustOrEmptyDemo {
    public static void main(String[] args) {
        // Create a Mono that emits a value
        Mono<String> monoJust = Mono.just("Hello, Reactive World!");

        // Create a Mono that emits an empty value
        Mono<String> monoEmpty = Mono.empty();

        // Subscribe to the Mono that emits a value
        monoJust.subscribe(value -> System.out.println("Mono.just emitted: " + value));

        // Subscribe to the Mono that emits an empty value
        monoEmpty.subscribe(
                value -> System.out.println("Mono.empty emitted: " + value),
                error -> System.err.println("Error: " + error),
                () -> System.out.println("Mono.empty completed without emitting a value")
        );

        Mono<String> monojustEmpty = Mono.justOrEmpty("Hello, Mono.justOrEmpty!");
        //Mono<String> monojustEmptyNull = Mono.justOrEmpty(null);
        monojustEmpty.subscribe();
    }
}

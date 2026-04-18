package com.universe.bluestone.reactive.mono;

import reactor.core.publisher.Mono;

public class MonoJustExample {
    public static void main(String[] args) {
        // Create a Mono that emits a single value
        Mono<String> monoJust = Mono.just("Hello, Reactive World!");

        // Subscribe to the Mono and print the emitted value
        monoJust.subscribe(System.out::println);
    }
}

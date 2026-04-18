package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class FluxConcatExample {

    public static void main(String[] args) {
        // Create the first Flux of fruits
        Flux<String> flux1 = Flux.just("apple", "banana", "mango", "orange").delayElements(Duration.ofMillis(500));

        // Create the second Flux of other fruits
        Flux<String> flux2 = Flux.just("pineapple", "kiwi", "grape").delayElements(Duration.ofMillis(500));

        // Merge the two fluxes concurrently
        Flux<String> mergedFlux = Flux.concat(flux1, flux2);

        // Subscribe and print the results as they arrive
        mergedFlux.subscribe(System.out::println);

        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
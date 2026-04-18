package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxAnyExample {
    public static void main(String[] args) {
        Flux<Integer> numbers = Flux.just(1, 3, 5, 8, 10);

        // Check if any number is even
        Mono<Boolean> hasEven = numbers.any(n -> n % 2 == 0);

        hasEven.subscribe(result -> System.out.println("Has even number: " + result)); 
        // Output: Has even number: true
    }
}
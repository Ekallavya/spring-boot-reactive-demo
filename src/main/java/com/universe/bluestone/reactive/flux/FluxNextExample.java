package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxNextExample {
    public static void main(String[] args) {
        // 1. Create a Flux with a range of integers
        Flux<Integer> integerFlux = Flux.range(100, 5); // Emits 100, 101, 102, 103, 104
        
        // 2. Use the next() method to get a Mono representing the first element
        Mono<Integer> firstElementMono = integerFlux.next();
        
        // 3. Subscribe to the resulting Mono to consume the first element
        firstElementMono.subscribe(
            value -> System.out.println("First element (onNext): " + value), // onNext consumer
            error -> System.err.println("Error (onError): " + error),       // onError consumer
            () -> System.out.println("Mono completion (onComplete)")        // onComplete runnable
        );
    }
}
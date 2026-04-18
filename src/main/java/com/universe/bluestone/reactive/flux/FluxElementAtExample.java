package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxElementAtExample {

    public static void main(String[] args) {
        Flux<String> colors = Flux.just("red", "green", "blue", "orange", "purple");

        // Get the element at index 2 (which is "blue")
        Mono<String> elementAtIndex2 = colors.elementAt(2);

        // Subscribe to the resulting Mono and print the element
        elementAtIndex2.subscribe(
            item -> System.out.println("Found element: " + item), // onNext
            error -> System.err.println("Error: " + error),       // onError
            () -> System.out.println("Completed")                 // onComplete
        );
    }
}
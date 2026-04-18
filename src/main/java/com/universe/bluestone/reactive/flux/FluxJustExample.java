package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

public class FluxJustExample {
    public static void main(String[] args) {
        // Create a Flux that emits "apple", "banana", and "orange"
        Flux<String> fruitFlux = Flux.just("apple", "banana", "orange");

        // Subscribe to the Flux to process each emitted item and print it
        fruitFlux.subscribe(System.out::println);

        // Another example with integers and additional operations
        Flux<Integer> integerFlux = Flux.just(1, 2, 3, 4)
                                        .filter(number -> number % 2 == 0) // Filter for even numbers
                                        .map(number -> number * 10);      // Transform them (20, 40)
        
        integerFlux.subscribe(
            item -> System.out.println("Processing item: " + item), // consumer for each item
            error -> System.err.println("Error: " + error),         // consumer for errors
            () -> System.out.println("integerFlux Completed!")                  // runnable for completion
        );

        Flux<String> stringFlux = Flux.just("America","Europe","Asia","Africa",null)
                .filter(str -> str.length() % 2 == 0) // Filter for even numbers
                .map(String::toUpperCase);      // Transform them (20, 40)

        stringFlux.subscribe(
                item -> System.out.println("Processing item: " + item), // consumer for each item
                error -> System.err.println("Error: " + error),         // consumer for errors
                () -> System.out.println("longFlux Completed!")                  // runnable for completion
        );


    }
}
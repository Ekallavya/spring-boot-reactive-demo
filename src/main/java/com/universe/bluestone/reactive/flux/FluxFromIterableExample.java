package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import java.util.List;

public class FluxFromIterableExample {

    public static void main(String[] args) {
        // 1. Define the source iterable
        List<String> fruits = List.of("Apple", "Orange", "Banana", "Grape");

        // 2. Create a Flux from the iterable
        Flux<String> fruitFlux = Flux.fromIterable(fruits);

        // 3. Apply an operation (e.g., map to uppercase)
        Flux<String> processedFlux = fruitFlux.map(String::toUpperCase);

        // 4. Subscribe to the Flux and print each element
        processedFlux.subscribe(
            System.out::println, // Consumer for each element (onNext)
            error -> System.err.println("Error: " + error.getMessage()), // Consumer for errors (onError)
            () -> System.out.println("Completed") // Runnable for completion (onComplete)
        );
    }
}
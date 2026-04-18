package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

public class FluxFromArrayExample {
    public static void main(String[] args) {
        // 1. Define an array of elements
        Integer[] numbers1 = {1, 2, 3, 4, 5};
        Integer[] numbers2 = {6,7,8,9,10};

        // 2. Create a Flux from the array using Flux.fromArray()
        Flux<Integer> fluxFromArray1 = Flux.fromArray(numbers1);

        // 3. Subscribe to the Flux to process the elements
        fluxFromArray1.subscribe(
            item -> System.out.println("Received: " + item), // consumer for each element
            error -> System.err.println("Error: " + error), // consumer for errors
            () -> System.out.println("fluxFromArray1 Completed")           // runnable for completion
        );

        Flux<Integer> fluxFromArray2 = Flux.fromArray(numbers1);
        fluxFromArray2.subscribe(System.out::println);

    }
}
package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import java.util.function.Function;

public class FluxAsExample {

    // A function that applies a specific transformation chain (mapping and filtering)
    // to any input Flux<Integer> and returns a Flux<String>
    public static Function<Flux<Integer>, Flux<String>> applyCustomTransformation() {
        return flux -> flux
            .map(i -> i * 2) // Multiply by 2
            .filter(i -> i > 5) // Keep only values greater than 5
            .map(i -> "Number: " + i); // Convert to String
    }

    public static void main(String[] args) {
        Flux<Integer> sourceFlux = Flux.just(1, 2, 3, 4, 5);

        // Use the as() operator to apply the custom transformation function
        sourceFlux
            .as(applyCustomTransformation())
            .subscribe(System.out::println); // Subscribe to trigger the execution
    }
}
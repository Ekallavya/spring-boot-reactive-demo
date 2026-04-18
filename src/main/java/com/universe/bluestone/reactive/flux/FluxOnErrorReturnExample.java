package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import java.util.Arrays;
import java.util.List;

public class FluxOnErrorReturnExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Flux<Integer> integerFlux = Flux.fromIterable(numbers)
            .map(i -> {
                // Simulate an error when i is 3
                if (i == 3) {
                    throw new ArithmeticException("Division by zero simulation");
                }
                return 10 / (5 - i); // Example operation
            })
            .onErrorReturn(ArithmeticException.class, -1) // Return -1 for a specific exception
            .onErrorReturn(0); // Generic fallback for any other error

        integerFlux.subscribe(
            value -> System.out.println("Received: " + value), // onNext
            error -> System.err.println("Error: " + error),   // onError (will not be called here)
            () -> System.out.println("Sequence complete")     // onComplete
        );
    }
}
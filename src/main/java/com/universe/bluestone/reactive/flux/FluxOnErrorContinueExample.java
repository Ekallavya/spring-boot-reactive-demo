package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import java.util.function.BiConsumer;

public class FluxOnErrorContinueExample {
    public static void main(String[] args) {
        // Define the error consumer
        BiConsumer<Throwable, Object> errorConsumer = (e, i) ->
            System.out.format("The value %d caused the exception: %s\n", i, e.getMessage());

        Flux.range(1, 5) // Emits 1, 2, 3, 4, 5
            .map(i -> {
                // Throws an exception when i is 3
                if (i == 3) {
                    return i / 0; // ArithmeticException here
                }
                return i * 2;
            })
            // Apply onErrorContinue to handle the error and continue
            .onErrorContinue(errorConsumer)
            .subscribe(
                System.out::println, // onNext: print the result
                error -> System.err.println("Subscriber error: " + error), // onError: should not be called
                () -> System.out.println("Completed") // onComplete: should be called
            );
    }
}

//output:
//        2
//        4
//The value 3 caused the exception: / by zero
//        8
//        10
//Completed
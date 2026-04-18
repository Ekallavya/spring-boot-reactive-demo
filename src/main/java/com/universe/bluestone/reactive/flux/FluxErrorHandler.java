package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.SynchronousSink;
import java.util.function.BiConsumer;

public class FluxErrorHandler {

    public static void main(String[] args) {
        BiConsumer<String, SynchronousSink<Integer>> handler =
                (input, sink) -> {
            try {
                // Try to parse the input string into an integer
                int value = Integer.parseInt(input);
                sink.next(value); // Emit the converted integer
            } catch (NumberFormatException e) {
                // If parsing fails, signal an error and cancel the sequence
                sink.error(new NumberFormatException("Invalid input: " + input));
            }
        };

        Flux<String> inFlux = Flux.just("1", "2", "not_a_number", "4");

        // Use type witness <Integer> to specify the output type without a map()
        Flux<Integer> outFlux = inFlux.<Integer>handle(handler);

        outFlux.subscribe(
                System.out::println,        // onNext consumer
                error -> System.err.println("Error: " + error.getMessage()) // onError consumer
        );
        // Output:
        // 1
        // 2
        // Error: Invalid input: not_a_number
    }
}
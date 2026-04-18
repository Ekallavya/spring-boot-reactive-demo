package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class FluxReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // Create a Flux from the list of numbers
        Flux<Integer> numberFlux = Flux.fromIterable(numbers);

        // Define the initial value and the accumulation function (summing)
        Integer initialValue = 0;
        BiFunction<Integer, Integer, Integer> sumAccumulator = (accumulator, currentItem) -> accumulator + currentItem;

        // Apply the reduce operator
        Mono<Integer> totalSumMono = numberFlux.reduce(initialValue, sumAccumulator);

        // Subscribe to the resulting Mono to get the final value
        totalSumMono.subscribe(sum -> System.out.println("The total sum is: " + sum));
    }
}
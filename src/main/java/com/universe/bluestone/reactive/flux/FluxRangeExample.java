package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

public class FluxRangeExample {
    public static void main(String[] args) {
        // Creates a Flux that emits integers from 1 up to (but not including) 4.
        // It emits 1, 2, and 3, then completes.
        Flux<Integer> integerFlux1 = Flux.range(1, 3);
        integerFlux1.subscribe(System.out::println);

        //prints 100, 101, 102, ..., 119
        Flux<Integer> integerFlux2 = Flux.range(100, 20);

        // Subscribe to the Flux and print each element

    }
}
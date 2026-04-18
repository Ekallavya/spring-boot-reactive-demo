package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class FluxCombineLatestExample {

    public static void main(String[] args) {

        // Source 1: even numbers 2 and 4
        Flux<Integer> evenNumbers = Flux.range(1, 10)
                .publishOn(Schedulers.boundedElastic())
                .filter(x -> x % 5 == 0);

        // Source 2: odd numbers 1, 3, and 5
        Flux<Integer> oddNumbers = Flux.range(1, 20)
                .filter(x -> x % 4 == 0);

        // Combine the latest values from both sources
        Flux<Integer> combinedFlux = Flux.combineLatest(
                evenNumbers,
                oddNumbers,
                (a, b) -> a + b // Combining function: sums the latest 'a' and 'b'
        );

        combinedFlux.subscribe(System.out::println);
    }
}
//output
//5
//7
//9
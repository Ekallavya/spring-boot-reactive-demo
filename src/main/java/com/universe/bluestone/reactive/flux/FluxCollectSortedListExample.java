package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.List;

public class FluxCollectSortedListExample {
    public static void main(String[] args) {
        Flux<Integer> integerFlux = Flux.just(1, 3, 2, 9, 8);

        // Collect and sort the elements in their natural ascending order
        Mono<List<Integer>> monoSortedList = integerFlux.collectSortedList();

        monoSortedList.subscribe(System.out::println);
        // Result: [1, 2, 3, 8, 9]
    }
}
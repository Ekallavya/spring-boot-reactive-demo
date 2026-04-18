package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import java.util.Comparator;

public class FluxMergeComparingExample {

    public static void main(String[] args) {
        // Source Flux sequences (they don't need to be fully sorted, but the operator picks 
        // the smallest current value from the head of each source)
        Flux<Integer> flux1 = Flux.just(1, 4, 9);
        Flux<Integer> flux2 = Flux.just(2, 5, 8);
        Flux<Integer> flux3 = Flux.just(3, 6, 7);

        // Define a natural order Comparator for integers
        Comparator<Integer> naturalOrder = Comparator.naturalOrder();
        Comparator<Integer> reverseOrder = Comparator.reverseOrder();

        // Use mergeComparing to merge the sources based on the comparator
        Flux<Integer> mergedFlux = Flux.mergeComparing(naturalOrder, flux1, flux2, flux3);

        // Subscribe and print the results
        mergedFlux.subscribe(System.out::println);
    }
}
package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import java.util.Comparator;

public class FluxMergePriorityExample {
    public static void main(String[] args) {
        // Pre-sorted sources (crucial for mergePriority to work correctly)
        Flux<Integer> source1 = Flux.just(10, 30, 50);
        Flux<Integer> source2 = Flux.just(20, 40, 60);
        Flux<Integer> source3 = Flux.just(5, 25, 45);

        // Comparator for ascending order
        Comparator<Integer> priorityComparator = Integer::compareTo;

        // Merge sources while maintaining sorted order
        Flux<Integer> mergedFlux = Flux.mergePriority(priorityComparator, source1, source2, source3);

        mergedFlux.subscribe(System.out::println);
        // Output: 5, 10, 20, 25, 30, 40, 45, 50, 60
    }
}
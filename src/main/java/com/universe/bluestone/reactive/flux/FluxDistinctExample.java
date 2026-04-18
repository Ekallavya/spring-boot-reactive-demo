package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import java.util.Arrays;
import java.util.List;

public class FluxDistinctExample {
    public static void main(String[] args) {
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 2, 3, 1, 4, 3, 5);

        Flux.fromIterable(numbersWithDuplicates)
                .distinct()
                .subscribe(System.out::println);
    }
}
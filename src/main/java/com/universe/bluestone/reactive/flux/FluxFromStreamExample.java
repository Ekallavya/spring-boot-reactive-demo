package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import java.util.Arrays;
import java.util.List;

public class FluxFromStreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Create a Flux from the stream of the list
        Flux<Integer> flux = Flux.fromStream(list.stream());

        // Subscribe to the Flux and print each element
        flux.subscribe(System.out::println);
    }
}
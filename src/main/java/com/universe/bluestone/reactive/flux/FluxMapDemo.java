package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

public class FluxMapDemo {
    public static void main(String[] args) {
        //Flux map example
        Flux<Integer> numbers = Flux.just(1, 2, 3, 4, 5);
        numbers.map(n -> n * n)
                .subscribe(System.out::println);
    }
}

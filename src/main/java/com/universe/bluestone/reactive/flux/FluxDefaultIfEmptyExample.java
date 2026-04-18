package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

public class FluxDefaultIfEmptyExample {
    public static void main(String[] args) {
        Flux<Integer> integerFlux = Flux.just(1, 2, 3, 4, 5);
        System.out.println("initial Flux size:" + integerFlux.count().block());

        integerFlux
            .filter(i -> i > 10) // This filter will result in an empty Flux
            .defaultIfEmpty(-1)  // The default value -1 will be used
            .subscribe(System.out::println);
    }
}
// Output:
// -1
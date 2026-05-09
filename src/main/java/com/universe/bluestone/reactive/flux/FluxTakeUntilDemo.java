package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

public class FluxTakeUntilDemo {
    public static void main(String[] args) {
            Flux<Integer> flux1 = Flux.range(100,200);

            flux1.takeUntil(i -> i % 3 == 0).subscribe(System.out::println);
    }
}

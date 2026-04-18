package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

public class FluxIntegerGenerator {

    public Flux<Integer> generateIntegers() {

        return Flux.generate(() -> 97, (state, sink) -> {
            sink.next(state);
            if (state == 110) {
                sink.complete();
            }
            return state + 1;
        });
    }

    public static void main(String[] args) {
        FluxIntegerGenerator generator = new FluxIntegerGenerator();
        generator.generateIntegers()
                .subscribe(System.out::println);
    }
}
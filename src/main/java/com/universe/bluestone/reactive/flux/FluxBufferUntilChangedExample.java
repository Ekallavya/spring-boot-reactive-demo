package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

public class FluxBufferUntilChangedExample {
    public static void main(String[] args) {
        Flux<String> flux = Flux.just("A", "A", "A", "B", "B", "C", "D", "D", "A");

        flux.bufferUntilChanged()
                .subscribe(list -> System.out.println("Received: " + list));
    }
}
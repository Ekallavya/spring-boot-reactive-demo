package com.universe.bluestone.reactive.mono;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoRepeatDemo {
    public static void main(String[] args) {
        Flux<String> flux = Mono.just("Hello, World!")
                .doOnNext(s -> System.out.println("Emitting: " + s))
                .repeat(2); // Repeat the Mono 2 times (total 3 emissions)

        flux.subscribe(System.out::println);
    }
}

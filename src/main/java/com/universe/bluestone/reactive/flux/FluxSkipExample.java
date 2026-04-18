package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;

public class FluxSkipExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("skip(n)");
        Flux.fromIterable(List.of("One", "Two", "Three", "Four"))
                .skip(1) // Skips the element "One"
                .subscribe(System.out::println);
        System.out.println("skipLast(n)");
        Flux.fromIterable(List.of("One", "Two", "Three", "Four"))
                .skipLast(1) // Skips the element "Four"
                .subscribe(System.out::println);

        System.out.println("skip(Duration.ofMillis(n)");
        // Emits 1, 2, 3, 4, 5... at 100ms intervals
        Flux<Long> fastFlux = Flux.interval(Duration.ofMillis(100));

    // Skips elements for the first 350ms (drops 0, 1, 2)
        Flux<Long> skippedFlux = fastFlux.skip(Duration.ofMillis(350));
        skippedFlux.subscribe(System.out::println);
        Flux<Long> fastFlux1 = Flux.interval(Duration.ofMillis(100));
        System.out.println("skipWhile(predicate)");
        Thread.sleep(6000);
        Flux<Long> skippedFlux1 = fastFlux.skipWhile(i ->i<50);
        skippedFlux1.subscribe(System.out::println);

        Thread.sleep(6000);
    }
}


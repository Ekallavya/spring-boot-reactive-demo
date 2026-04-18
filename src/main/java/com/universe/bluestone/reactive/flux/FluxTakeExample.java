package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class FluxTakeExample {

    public static void main(String[] args) {
        System.out.println("take:");
        Flux.range(1, 10) // Emits 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
            .take(3)     // Takes only the first 3 elements
            .subscribe(System.out::println); // Subscribes and prints each element
        System.out.println();
        Flux.range(50, 100) // Emits 50,51, 52, ..., 149
                .take(Duration.ofMillis(1))     // Takes elements
                .subscribe(System.out::println); // Subscribes and prints each element
        System.out.println("takeLast:");
        Flux.range(50, 100) // Emits 50,51, 52, ..., 149
                .takeLast(10)     // Takes last 10 elements
                .subscribe(System.out::println);
        System.out.println("limitRate:");
        Flux.range(50, 100) // Emits 50,51, 52, ..., 149
                .limitRate(10)     //
                .subscribe(System.out::println);
        System.out.println("takeWhile:");
        Flux.range(50, 100) // Emits 50,51, 52, ..., 149
                .takeWhile(i -> i<75)     // multiple checks -> Takes elements while the condition is met (i < 75)
                .subscribe(System.out::println);
        System.out.println("takeUntil:");
        Flux.range(50, 100) // Emits 50,51, 52, ..., 149
                .takeUntil(i -> i<75)   // only one check -> Takes elements until the condition is met (i < 75)
                .subscribe(System.out::println);


    }
}
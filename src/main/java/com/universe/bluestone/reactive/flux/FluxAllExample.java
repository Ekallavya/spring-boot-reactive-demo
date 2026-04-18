package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxAllExample {

    public static void main(String[] args) {
        // Example 1: All elements satisfy the predicate (even numbers)
        Flux<Integer> evenNumbers = Flux.just(2, 4, 6, 8);
        Mono<Boolean> allEvenMono = evenNumbers.all(number -> number % 2 == 0);

        allEvenMono.subscribe(result -> 
            System.out.println("Are all numbers even in Flux 1? " + result)
        );

        // Example 2: Not all elements satisfy the predicate (includes an odd number)
        Flux<Integer> mixedNumbers = Flux.just(1, 2, 3, 4);
        Mono<Boolean> allEvenMono2 = mixedNumbers.all(number -> number % 2 == 0);

        allEvenMono2.subscribe(result -> 
            System.out.println("Are all numbers even in Flux 2? " + result)
        );
        
        // Example 3: An empty Flux (predicate is vacuously true)
        Flux<Integer> emptyFlux = Flux.empty();
        Mono<Boolean> allEvenMono3 = emptyFlux.all(number -> number % 2 == 0);
        
        allEvenMono3.subscribe(result ->
            System.out.println("Are all numbers even in Flux 3? " + result)
        );
    }
}

//output:
// Are all numbers even in Flux 1? true
// Are all numbers even in Flux 2? false
// Are all numbers even in Flux 3? true
package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

public class FluxZipExample {
    public static void main(String[] args) {
        Flux<String> f1 = Flux.just("One", "Three", "Five");
        Flux<String> f2 = Flux.just("Two", "Four", "Six");

        Flux<Tuple2<String, String>> zippedFlux = Flux.zip(f1, f2);
        zippedFlux.subscribe(tuple->{
            System.out.println(tuple.get(0) + " ==" + tuple.get(1));
        });
        zippedFlux.subscribe(System.out::println);
        // Output:
        // [One,Two]
        // [Three,Four]
        // [Five,Six]
        //ZipWithCombinatorExample
        Flux<String> zipWithCombinator = Flux.zip(
                f1,
                f2,
                (item1, item2) -> item1 + item2 // Combinator function
        );

        zipWithCombinator.subscribe(System.out::println);
        // Output:
        // OneTwo
        // ThreeFour
        // FiveSix

        Mono<String> greetingMono = Mono.just("Hello");
        Flux<String> namesFlux = Flux.just("Alice", "Bob", "Charlie");

        // We use repeat() on the mono so it can be "zipped" with every element of the flux
        Flux<String> monFluxZipped = namesFlux.zipWith(greetingMono.repeat(), (name, greeting) -> greeting + " " + name);

        monFluxZipped.subscribe(System.out::println);
        // Output:
        // Hello Alice
        // Hello Bob
        // Hello Charlie
    }

}


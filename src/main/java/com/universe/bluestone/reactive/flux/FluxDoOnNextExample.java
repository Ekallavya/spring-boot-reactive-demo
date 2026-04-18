package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import java.time.Duration;

public class FluxDoOnNextExample {
    public static void main(String[] args) throws InterruptedException {
        // Source 1 emits after a 100ms delay for each element
        Flux<String> flux1 = Flux.just("A", "B", "C")
            .delayElements(Duration.ofMillis(100))
            .doOnNext(item -> System.out.println("Emitting from flux1: " + item));
        // Source 2 emits immediately
        Flux<String> flux2 = Flux.just("X", "Y", "Z")
            .doOnNext(item -> System.out.println("Emitting from flux2: " + item));

        // Merge the two fluxes
        Flux<String> mergedFlux = Flux.merge(flux1, flux2);

        System.out.println("Subscribing to mergedFlux. Output order will be non-deterministic:");

        mergedFlux.subscribe(element -> System.out.println("Received: " + element));

        // Keep the main thread alive to see the delayed emissions
        Thread.sleep(500); 
    }
}
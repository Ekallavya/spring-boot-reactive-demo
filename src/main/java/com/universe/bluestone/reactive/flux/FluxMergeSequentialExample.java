package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import java.time.Duration;

public class FluxMergeSequentialExample {

    public static void main(String[] args) throws InterruptedException {
        // Source Flux 1: elements a, b, c with a delay of 100ms
        Flux<String> flux1 = Flux.just("a", "b", "c")
                                 .delayElements(Duration.ofMillis(100));

        // Source Flux 2: elements x, y, z with a delay of 30ms (faster)
        Flux<String> flux2 = Flux.just("x", "y", "z")
                                 .delayElements(Duration.ofMillis(30));

        // Merge the two fluxes sequentially
        Flux<String> mergedFlux = Flux.mergeSequential(flux1, flux2);

        // Subscribe and print elements
        mergedFlux.subscribe(
            element -> System.out.println("Received: " + element),
            error -> System.err.println("Error: " + error),
            () -> System.out.println("Completed")
        );

        // Keep the main thread alive to observe the asynchronous emissions
        Thread.sleep(1000);
    }
}
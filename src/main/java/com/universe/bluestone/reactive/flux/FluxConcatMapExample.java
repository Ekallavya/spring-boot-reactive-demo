package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import java.time.Duration;

public class FluxConcatMapExample {

    public static void main(String[] args) {
        Flux<Integer> source = Flux.just(1, 2, 3);

        Flux<String> result = source.concatMap(
            // The mapper function converts each integer to a new Flux
            // We use a small delay to simulate an asynchronous operation
            i -> Flux.just("A" + i, "B" + i)
                     .delayElements(Duration.ofMillis(1000)) // Simulate async work
        );

        // Subscribe to the result and print each element
        result.subscribe(System.out::println);

        // Keep the main thread alive for a moment to see the async results
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class FluxBufferUntilExample {

    public static void main(String[] args) {
        // Source Flux of integers 1, 2, 3, 4, 5, ...
        // delayElements is used to simulate a continuous, asynchronous stream
        Flux<Integer> integerFlux = Flux.range(1, 10)
                                        .delayElements(Duration.ofMillis(500));

        // Use bufferUntil with a predicate to check for an even number
        integerFlux.bufferUntil(i -> i % 2 == 0)
                   .subscribe(buffer -> System.out.println("Received buffer: " + buffer));

        // Keep the application alive long enough to see the output
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
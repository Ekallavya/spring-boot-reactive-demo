package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import java.time.Duration;

public class FluxTimeoutExample {
    public static void main(String[] args) {
        Flux<String> flux = Flux.just("test-item")
            .delayElements(Duration.ofSeconds(1)) // Delays the emission by 10 seconds
            .timeout(Duration.ofSeconds(2));       // Sets a timeout of 1 second

        flux.subscribe(
            item -> System.out.println("Received: " + item),
            error -> System.err.println("Error: " + error.getMessage()), // Handles the TimeoutException
            () -> System.out.println("Completed")
        );

        // The main thread needs to wait for the reactive stream to finish
        try {
            Thread.sleep(2000); // Wait to observe the output
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("----------------------------");

        Flux<String> flux1 = Flux.just("test-item")
                .delayElements(Duration.ofSeconds(3)) // Delays the emission by 10 seconds
                .timeout(Duration.ofSeconds(2));       // Sets a timeout of 1 second

        flux1.subscribe(
                item -> System.out.println("Received: " + item),
                error -> System.err.println("Error: " + error.getMessage()), // Handles the TimeoutException
                () -> System.out.println("Completed")
        );
    }
}
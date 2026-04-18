package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import java.time.Duration;

public class FluxDelaySubscriptionExample {

    public static void main(String[] args) {
        System.out.println("Application started at: " + java.time.Instant.now());

        Flux<String> delayedFlux = Flux.just("Data1", "Data2", "Data3")
                // The source is not subscribed to until 3 seconds elapse
                .delaySubscription(Duration.ofSeconds(7))
                .doOnSubscribe(subscription -> 
                    System.out.println("Subscribed at: " + java.time.Instant.now())
                );

        delayedFlux.subscribe(
            data -> System.out.println("Received: " + data + " at " + java.time.Instant.now()),
            error -> System.err.println("Error: " + error),
            () -> System.out.println("Completed at: " + java.time.Instant.now())
        );

        // Keep the application alive long enough to see the output
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
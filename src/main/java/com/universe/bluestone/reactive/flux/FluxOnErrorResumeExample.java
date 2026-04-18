package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class FluxOnErrorResumeExample {

    // A mock external service that throws an error for "key2"
    public Flux<String> callExternalService(String key) {
        if ("key2".equals(key)) {
            return Flux.error(new RuntimeException("External service failed for key2"));
        }
        return Flux.just(key + "_value_A", key + "_value_B");
    }

    // A mock local cache service
    public Flux<String> getFromCache(String key) {
        System.out.println("Falling back to cache for key: " + key);
        return Flux.just(key + "_cached_value_X", key + "_cached_value_Y");
    }

    public void demonstrateOnErrorResume() {
        List<String> keys = Arrays.asList("key1", "key2", "key3");

        Flux<String> resultFlux = Flux.fromIterable(keys)
            .flatMap(key -> callExternalService(key)
                // If callExternalService fails, the onErrorResume block is executed for that specific key
                .onErrorResume(e -> {
                    System.out.println("Handling error in flatMap for key " + key + ": " + e.getMessage());
                    return getFromCache(key); // Switches to the cache publisher
                })
            );

        resultFlux.subscribe(
            value -> System.out.println("Received: " + value),
            error -> System.err.println("Error in main subscription: " + error.getMessage()),
            () -> System.out.println("Completed")
        );
    }

    public static void main(String[] args) {
        new FluxOnErrorResumeExample().demonstrateOnErrorResume();
    }
}
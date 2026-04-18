package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

public class FluxOnErrorMapExample {

    // Define a custom exception class
    static class CustomException extends RuntimeException {
        public CustomException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Flux<String> flux = Flux.just("user1", "user2", "invalid_user", "user3")
                .map(userId -> {
                    // Simulate an error condition
                    if (userId.equals("invalid_user")) {
                        throw new IllegalArgumentException("Invalid user ID: " + userId);
                    }
                    return "Processed User: " + userId;
                })
                // Use onErrorMap to transform the IllegalArgumentException to a CustomException
                .onErrorMap(IllegalArgumentException.class, ex -> {
                    System.out.println("Mapping error: " + ex.getMessage());
                    return new CustomException("A custom error occurred: " + ex.getMessage());
                })
                .doOnError(e -> System.out.println("Caught downstream error: " + e.getMessage()));

        // Subscribe to the flux to observe the behavior
        flux.subscribe(
                System.out::println, // onNext
                error -> System.err.println("Subscriber received error: " + error.getMessage()), // onError
                () -> System.out.println("Completed") // onComplete
        );

    
    }
}
package com.universe.bluestone.reactive.mono;

import reactor.core.publisher.Mono;

public class MonoFromSupplierDemo {
    public static void main(String[] args) {
        // Create a Mono from a Supplier
        Mono<String> monoFromSupplier = Mono.fromSupplier(() -> {
            System.out.println("Generating value...");
            return "Hello, World!";
        });

        // Subscribe to the Mono
        monoFromSupplier.subscribe(value -> System.out.println("Received: " + value));
    }
}

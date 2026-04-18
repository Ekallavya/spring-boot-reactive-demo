package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.*;

public class FluxLogExample {

    public static void main(String[] args) {
        // This creates an immutable list, which cannot be modified after creation.
        List<String> items = Arrays.asList("red", "white", "blue");

            Flux.fromIterable(items)
                .log() // Inserts a logging operator into the sequence
                .map(String::toUpperCase) // Example of a subsequent operation
                .subscribe(
                    data -> System.out.println("Subscriber received: " + data),
                    error -> System.err.println("Subscriber error: " + error),
                    () -> System.out.println("Subscriber completed")
                );


        try {
            Thread.sleep(Duration.ofMinutes(1));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Exiting main method");
        }
    }
}
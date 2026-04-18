package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class FluxBlockingExample {
    public static void main(String[] args) {
        Flux<String> flux = Flux.just("A", "B", "C").log().delayElements(Duration.ofSeconds(1));

        // Problematic blocking call in a reactive context
        String firstElement = flux.blockFirst();

        System.out.println("First element is: " + firstElement);
        // Output: First element is: A

        //String lastElement = flux.blockLast();
        String lastElement = flux.blockLast(Duration.ofMillis(2000)); // This will likely time out and return null

        System.out.println("last element is: " + lastElement);
    }
}
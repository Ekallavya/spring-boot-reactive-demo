package com.universe.bluestone.reactive.mono;

import reactor.core.publisher.Mono;

import java.time.Duration;

public class MonoFirstDemo {
    public static void main(String[] args) {
        Mono<String> mono1 = Mono.just("First Mono").delayElement(Duration.ofMillis(100));
        Mono<String> mono2 = Mono.just("Second Mono").delayElement(Duration.ofMillis(50));

        Mono<String> firstMono = Mono.first(mono1, mono2);

        firstMono.subscribe(result -> System.out.println("Received: " + result));

        try {
            Thread.sleep(Duration.ofSeconds(2).toMillis()); // Wait for the Mono to complete before exiting
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

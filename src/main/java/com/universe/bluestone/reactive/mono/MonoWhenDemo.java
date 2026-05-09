package com.universe.bluestone.reactive.mono;

import reactor.core.publisher.Mono;

import java.time.Duration;

public class MonoWhenDemo {
        public static void main(String[] args) {
            Mono<String> mono1 = Mono.just("Hello");
            Mono<String> mono2 = Mono.just("World");

            Mono<Void> combinedMono = Mono.when(mono1, mono2);

            combinedMono.subscribe(
                    unused -> System.out.println("Both monos completed successfully!"),
                    error -> System.err.println("An error occurred: " + error),
                    () -> System.out.println("Done!")
            );
            try {
                Thread.sleep(Duration.ofSeconds(5));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
}

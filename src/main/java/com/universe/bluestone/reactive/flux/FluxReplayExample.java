package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class FluxReplayExample {
    public static void main(String[] args) throws InterruptedException {
        Flux<Integer> source = Flux.range(1, 10)
                .delayElements(Duration.ofMillis(100))
                .replay(5)       // Caches only the last 2 elements
                .autoConnect();  // Starts the source upon the first subscription

// Subscriber 1 start immediately
        source.subscribe(i -> System.out.println("Sub1: " + i));

// Delaying Subscriber 2 so it misses the first few emissions
        Thread.sleep(3500);

// Subscriber 2 will receive the 2 cached elements then continue live
        source.subscribe(i -> System.out.println("Sub2: " + i));
    }
}

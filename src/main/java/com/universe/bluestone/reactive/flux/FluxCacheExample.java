package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import java.time.Duration;

public class FluxCacheExample {

     static  int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        // 1. Define the source Flux. The 'generate' and 'delayElements'
        // make it an "expensive" operation (simulated here with time).
        Flux<Object> values = Flux.generate(synchronousSink -> {
            synchronousSink.next("Item :"+ counter++);
        })
        .delayElements(Duration.ofMillis(50))
        // 2. Apply the cache operator, caching elements for 5 seconds.
        .cache(Duration.ofSeconds(5))
        .take(5); // Take only the first 5 elements

        // --- First Subscription ---
        System.out.println("Printing data the 1st time, then the cache should be filled:");
        values.subscribe(System.out::println);
        
        System.out.printf("%nWaiting 1 second...%n%n");
        Thread.sleep(1000); // Wait for a second

        // --- Second Subscription (within cache duration) ---
        System.out.println("Printing data the 2nd time, data from the cache should be used:");
        values.subscribe(System.out::println);
        // The timestamps will be the *same* as the first subscription

        System.out.printf("%nWaiting 6 seconds (cache timeout is 5s)...%n%n");
        Thread.sleep(6000); // Wait longer than the cache timeout

        // --- Third Subscription (after cache timeout) ---
        System.out.println("Printing data the 3rd time, now new data should be generated (new timestamps):");
        values.subscribe(System.out::println);
        // The timestamps will be *new*, as the cache has expired and the source is re-executed
    }
}
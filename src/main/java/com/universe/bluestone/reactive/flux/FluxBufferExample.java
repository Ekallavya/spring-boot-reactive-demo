package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.UUID;

public class FluxBufferExample {

    public static void main(String[] args) {
        Flux.range(1, 10)
            .buffer(3) // Collects items into Lists for every 3 items emitted
            .subscribe(list -> System.out.println("Received batch: " + list));

        Flux.range(1, 10000000)
                .buffer(Duration.ofMillis(1000)) // Collects items into Lists for specified time duration
                .subscribe(list -> System.out.println("Received batch: " + list));


        Flux.range(1, 10000000)
                .map(x -> UUID.randomUUID().toString())
                .bufferTimeout(4,Duration.ofMillis(10)) // Collects items into Lists for specified time duration or specified number of items, whichever comes first
                .subscribe(list -> System.out.println("Received batch: " + list));

        try {
            Thread.sleep(Duration.ofMinutes(1));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println();
        }
    }
}
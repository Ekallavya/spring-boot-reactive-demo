package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.BufferOverflowStrategy;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;
import java.time.Duration;

public class FluxBackPressureBufferExample {
    public static void main(String[] args) throws InterruptedException {

        // 1. Create a fast publisher
        Flux<Integer> fastPublisher = Flux.range(1, 100)
                .delayElements(Duration.ofMillis(1)) // Emit an item every 1ms
                .doOnNext(i -> System.out.println("Produced: " + i));

        // 2. Apply onBackpressureBuffer() with a buffer size of 10 and a drop callback
        Flux<Integer> bufferedFlux = fastPublisher
                .onBackpressureBuffer(10, dropped ->
                    System.out.println("Buffered, dropped: " + dropped), BufferOverflowStrategy.DROP_OLDEST);

        // 3. Create a slow subscriber
        bufferedFlux.subscribeOn(Schedulers.boundedElastic()) // Run subscription on a separate thread
                .subscribe(data -> {
                    try {
                        Thread.sleep(10); // Simulate slow processing
                        System.out.println("Consumed: " + data);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                },
                error -> System.err.println("Error: " + error),
                () -> System.out.println("Completed"));

        Thread.sleep(1100);
    }
}
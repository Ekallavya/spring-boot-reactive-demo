package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;
import java.time.Duration;

public class FluxBackPressureDropExample {
    public static void main(String[] args) throws InterruptedException {
        // Fast producer: 100 items very quickly
        Flux<Object> fastProducer = Flux.generate(() -> 97, (state, sink) -> {
            sink.next(state);

            return state + 1;
        }).delayElements(Duration.ofMillis(50))
                .doOnNext(i -> System.out.println("Produced: " + i))
                // Drop strategy: Log dropped items
                .onBackpressureDrop(dropped -> System.out.println("------------->Dropped: " + dropped));

        // Slow consumer: Takes 10ms per item

        fastProducer.publishOn(Schedulers.boundedElastic()).subscribe(data -> {
                    try {
                        Thread.sleep(1000);
                        System.out.println("Consumed: " + data);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });

        Thread.sleep(1000); // Allow time for execution
    }
}
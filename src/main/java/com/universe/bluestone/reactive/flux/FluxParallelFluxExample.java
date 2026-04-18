package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class FluxParallelFluxExample {
    public static void main(String[] args) {
        Flux.range(1, 10)
            .parallel(4) // Split into 4 "rails"
            .runOn(Schedulers.parallel()) // Execute on parallel threads
            .doOnNext(i -> System.out.println(Thread.currentThread().getName() + " -> " + i))
            .subscribe();
            
        // Keep thread alive to see output
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
    }
}
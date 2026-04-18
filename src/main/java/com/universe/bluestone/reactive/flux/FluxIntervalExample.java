package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import java.time.Duration;
import java.time.Instant;

public class FluxIntervalExample {

    // A placeholder service for handling metrics
    static class MetricsService {
        public void collectAndSendMetrics() {
            System.out.println("Collecting and sending metrics at " + Instant.now());
            // Actual non-blocking I/O operations would go here (e.g., calling an API with WebClient)
        }
    }

    public static void main(String[] args) throws InterruptedException {


        Flux<Long>  longFlux=Flux.interval(Duration.ofMillis(100));

        longFlux.subscribe(System.out::println);

        MetricsService metricsService = new MetricsService();

        Flux.interval(Duration.ofSeconds(10)) // Emits a Long tick every 10 seconds on a background thread
            .doOnNext(tick -> System.out.println("Tick received: " + tick))
            .subscribe(tick -> metricsService.collectAndSendMetrics()); // Trigger the action

        // Keep the main thread alive to observe the interval
        Thread.sleep(100000);

    }
}
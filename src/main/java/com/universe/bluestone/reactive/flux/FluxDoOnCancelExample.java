package com.universe.bluestone.reactive.flux;

import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import java.time.Duration;

public class FluxDoOnCancelExample {

    public static void main(String[] args) throws InterruptedException {
        // 1. Define a Flux that emits elements with a delay
        Flux<Long> flux = Flux.interval(Duration.ofSeconds(1))
                .doOnNext(element -> System.out.println("Emitting: " + element))
                // 2. Add the doOnCancel hook to log the cancellation event
                .doOnCancel(() -> System.out.println("--- Subscription Cancelled! ---"))
                // 3. Add a doOnComplete hook to show it's not called on cancellation
                .doOnComplete(() -> System.out.println("--- Flux Completed (should not appear) ---"));

        // 4. Subscribe to the Flux and get a Disposable reference
        Disposable disposable = flux.subscribe(
                data -> System.out.println("Received: " + data),
                error -> System.err.println("Error: " + error),
                () -> System.out.println("Subscription completed")
        );

        // 5. Wait for a few seconds to let some elements emit
        Thread.sleep(3500);

        // 6. Manually dispose the subscription, triggering doOnCancel
        System.out.println("\nManually disposing the subscription...");
        disposable.dispose();

        // 7. Wait to observe that no further elements are received and the complete hook is not called
        Thread.sleep(2000);
    }
}
package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

public class FluxDoAfterTerminateExample {

    public static Flux<String> createFlux() {
        return Flux.just("1", "2", "3")
                .doFirst(() -> System.out.println("doFirst -->  Starting the stream processing for this subscriber"))
                .doOnRequest(req -> System.out.println("Requested " + req + " items"))
                .doOnEach(signal -> {
                    System.out.println("doOnEach --> Received signal: " + signal.getType());
                    if (signal.isOnNext()) {
                        System.out.println("Processing next item: " + signal.get());
                    } else if (signal.isOnComplete()) {
                        System.out.println("Stream completed.");
                    } else if (signal.isOnError()) {
                        System.out.println("Error occurred: " + signal.getThrowable());
                    }
                })
                .doAfterTerminate(() -> System.out.println("doAfterTerminate--> Flux sequence terminated"))
                .doOnNext(i -> System.out.println("doOnNext --> Processing item: " + i))
                .doOnComplete(() -> System.out.println("doOnComplete --> Flux completed successfully!"))
                .doFinally(signalType -> {
                    // This action runs after the Flux terminates
                    System.out.println("doFinally --> Sequence terminated with signal type: " + signalType);
                    // Common use case: resource cleanup
                });
    }

    public static void main(String[] args) {

        Flux<String> datFlux = createFlux();
        datFlux.subscribe(System.out::println);
    }
}
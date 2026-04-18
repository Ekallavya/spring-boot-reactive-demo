package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

public class FluxOnErrorCompleteExample {

    // A method that throws a RuntimeException when the input is 30
    private int doSomethingDangerousOn30(int number) {
        if (number == 30) {
            throw new RuntimeException("Error occurred on number 30");
        }
        return number;
    }

    public void demonstrateOnErrorComplete() {
        Flux.just(10, 20, 30, 40, 50)
            .map(this::doSomethingDangerousOn30) // This will throw an error when processing 30
            .onErrorComplete() // The error will be converted to a completion signal
            .subscribe(
                data -> System.out.println("Received: " + data),
                error -> System.err.println("Error (should not happen): " + error),
                () -> System.out.println("Completed successfully!") // This will be called
            );
    }

    public static void main(String[] args) {
        FluxOnErrorCompleteExample example = new FluxOnErrorCompleteExample();
        example.demonstrateOnErrorComplete();
    }
}
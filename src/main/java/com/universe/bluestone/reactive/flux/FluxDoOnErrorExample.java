package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;
import java.util.concurrent.atomic.LongAdder;

public class FluxDoOnErrorExample {

    public static void main(String[] args) {
        LongAdder failureStat = new LongAdder();

        Flux<Integer> integerFlux = Flux.just(1, 2, 3, 4, 5);

        integerFlux
            // An error occurs when i is 3 (division by zero)
            .map(i -> i / (i - 3))
            .doOnError(ArithmeticException.class, e -> {
                // This is the side effect: log the error and increment a counter
                System.out.println("Side effect: encountered an exception - " + e.getMessage());
                failureStat.increment();
            })
            // The error is still propagated and handled here
            .subscribe(
                System.out::println, // onNext consumer
                throwable -> System.err.println("Error handled in subscribe: " + throwable.getMessage()), // onError consumer
                () -> System.out.println("Completed") // onComplete consumer
            );

        // Print the side effect result
        System.out.println("Total failures counted: " + failureStat.intValue());
    }
}
//output
//0
//        -2
//Side effect: encountered an exception - / by zero
//Error handled in subscribe: / by zero
//Total failures counted: 1
//
//Process finished with exit code 0
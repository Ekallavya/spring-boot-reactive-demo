package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

public class FluxDeferExample {
    public static void main(String[] args) throws InterruptedException {

        // Using Flux.just() - value is captured immediately
        Flux<Long> justFlux = Flux.just(System.currentTimeMillis());
        
        System.out.println("--- Using Flux.just() ---");
        // Subscriber 1 receives the value captured at 'justFlux' creation time
        justFlux.subscribe(time -> System.out.println("Subscriber 1 received: " + time)); 
        
        // Wait some time
        Thread.sleep(2000); 
        
        // Subscriber 2 receives the *same* value as Subscriber 1
        justFlux.subscribe(time -> System.out.println("Subscriber 2 received: " + time));


        // Using Flux.defer() - value is captured at subscription time
        Flux<Long> deferFlux = Flux.defer(() -> Flux.just(System.currentTimeMillis()));
        
        System.out.println("\n--- Using Flux.defer() ---");
        // Subscriber 3 receives the current time
        deferFlux.subscribe(time -> System.out.println("Subscriber 3 received: " + time));
        
        // Wait some time
        Thread.sleep(2000); 
        
        // Subscriber 4 receives a *new*, updated current time
        deferFlux.subscribe(time -> System.out.println("Subscriber 4 received: " + time));
    }
}
//output:
//        --- Using Flux.just() ---
//Subscriber 1 received: 1771244702793
//Subscriber 2 received: 1771244702793
//
//        --- Using Flux.defer() ---
//Subscriber 3 received: 1771244706843
//Subscriber 4 received: 1771244708854
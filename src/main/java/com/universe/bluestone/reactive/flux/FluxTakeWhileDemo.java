package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

public class FluxTakeWhileDemo {
    public static void main(String[] args) throws InterruptedException {
        Flux<Integer> flux1 = Flux.range(100,200);

        flux1.takeWhile(i -> i <150).subscribe(System.out::println);

        Thread.sleep(100000);
    }
}

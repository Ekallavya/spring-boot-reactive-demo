package com.universe.bluestone.reactive.flux;

import reactor.core.publisher.Flux;

public class FluxGeneratorDemo {
    
    public Flux<Character> generateCharacters() {
        
        return Flux.generate(() -> 97, (state, sink) -> {
            char value = (char) state.intValue();
            sink.next(value);
            if (value == 'z') {
                sink.complete();
            }
            return state + 1;
        });
    }

    public static void main(String[] args) {
        FluxGeneratorDemo generator = new FluxGeneratorDemo();
        // Output: a b c d e f g h i j k l m n o p q r s t u v w x y z
        generator.generateCharacters()
                .subscribe(System.out::print);
        //Another example of using generate to create a Flux of Random Strings

        Flux<String> randomStrings = Flux.generate(sink -> {
            String randomString = "Random-" + (int) (Math.random() * 100);
            sink.next(randomString);
            if (randomString.endsWith("0")) {
                sink.complete();
            }
        });
        System.out.println("\nRandom Strings:");
        randomStrings.subscribe(System.out::println);


    }
}
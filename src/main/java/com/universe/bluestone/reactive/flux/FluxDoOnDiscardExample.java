package com.universe.bluestone.reactive.flux;

import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import java.util.Arrays;
import java.util.List;

public class FluxDoOnDiscardExample {

    // A simple class to use in the Flux
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        // Getters and setters for demonstration purposes
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + '}';
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 5),
            new Person("Charlie", 10),
            new Person("David", 25)
        );

        Disposable disposable= Flux.fromIterable(people)
            // Filter out people younger than 18
            .filter(p -> p.getAge() >= 18)
            // Register a callback for any discarded items (those filtered out)
            .doOnDiscard(Person.class, p -> System.out.println("Discarded: " + p))
            // Subscribe to process the remaining items
            .subscribe(
                person -> System.out.println("Received: " + person),
                error -> System.err.println("Error: " + error),
                () -> System.out.println("Completed.")
            );


    }
}
//output:
//Discarded: Person{name='Bob', age=5}
//Discarded: Person{name='Charlie', age=10}
//Received: Person{name='Alice', age=30}
//Received: Person{name='David', age=25}
//Completed.
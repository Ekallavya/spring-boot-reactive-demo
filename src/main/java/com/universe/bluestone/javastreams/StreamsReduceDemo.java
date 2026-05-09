package com.universe.bluestone.javastreams;

import java.util.Arrays;
import java.util.OptionalInt;

public class StreamsReduceDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Using reduce to sum the numbers
        int sum = java.util.Arrays.stream(numbers)
                .reduce(0, (a, b) ->{
                    System.out.print("a :"+a);
                    System.out.println("   b :"+b);
                    return a + b;});

        System.out.println("Sum: " + sum);

        // Using reduce to sum the numbers
        OptionalInt sum1 = Arrays.stream(numbers)
                .reduce((a, b) ->{
                    System.out.print("a :"+a);
                    System.out.println("   b :"+b);
                    return a + b;});

        System.out.println("Sum: " + sum1);
    }
}

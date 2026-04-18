package com.universe.bluestone.javastreams;

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
    }
}

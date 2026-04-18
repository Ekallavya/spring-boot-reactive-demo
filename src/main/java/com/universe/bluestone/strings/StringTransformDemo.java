package com.universe.bluestone.strings;

public class StringTransformDemo {
    public static void main(String[] args) {
        String input = "hello world";
        String transformed = input.transform(str -> str+" ,welcome to Java 21");
        System.out.println(transformed); // Output: hello world ,welcome to Java 21
    }
}

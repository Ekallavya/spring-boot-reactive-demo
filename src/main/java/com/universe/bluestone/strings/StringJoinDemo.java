package com.universe.bluestone.strings;

public class StringJoinDemo {
    public static void main(String[] args) {
        String[] words = {"Hello", "World", "Java", "21"};
        String joined = String.join(" ", words);
        System.out.println(joined); // Output : Hello World Java 21
        String joined1 = String.join(", ", words);
        System.out.println(joined1); //Hello, World, Java, 21
    }
}

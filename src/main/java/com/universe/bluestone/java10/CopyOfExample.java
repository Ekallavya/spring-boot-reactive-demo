package com.universe.bluestone.java10;

import java.util.ArrayList;
import java.util.List;

public class CopyOfExample {
    public static void main(String[] args) {
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Apple");
        mutableList.add("Banana");

        // Create an unmodifiable copy in Java 10
        List<String> unmodifiableList = List.copyOf(mutableList);

        System.out.println(unmodifiableList); 

        // This line will throw UnsupportedOperationException
        // unmodifiableList.add("Orange");
    }
}
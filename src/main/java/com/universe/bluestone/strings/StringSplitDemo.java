package com.universe.bluestone.strings;

public class StringSplitDemo {
    public static void main(String[] args) {
        String input = "apple,banana,orange";
        String[] fruits = input.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}

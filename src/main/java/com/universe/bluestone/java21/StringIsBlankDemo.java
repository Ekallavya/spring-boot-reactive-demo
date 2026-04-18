package com.universe.bluestone.java21;

public class StringIsBlankDemo {
    public static void main(String[] args) {
        String str1 = "   ";
        String str2 = "";
        String str3 = "Hello";

        System.out.println("Is str1 blank? " + str1.isBlank()); // true
        System.out.println("Is str2 blank? " + str2.isBlank()); // true
        System.out.println("Is str3 blank? " + str3.isBlank()); // false
    }
}

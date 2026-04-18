package com.universe.bluestone.java21;

public class StringFormatDemo {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 30;
        String formattedString = String.format("My name is %s and I am %d years old.", name, age);
        System.out.println(formattedString);
        // other formatting options
        double price = 19.99;
        String priceString = String.format("The price is $%.2f", price);
        System.out.println(priceString);
        // other formatting options
        String hexString = String.format("The hexadecimal representation of %d is %x", age, age);
        System.out.println(hexString);

    }
}

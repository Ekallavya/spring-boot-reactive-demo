package com.universe.bluestone.java21;

public class StringTextBlockDemo {
    public static void main(String[] args) {
        String textBlock = """
                This is a text block in Java 21.
                It allows for multi-line string literals without the need for escape characters.
                You can include special characters like "quotes" and \n backslashes\t without escaping them.
                """;

        System.out.println(textBlock);
    }
}

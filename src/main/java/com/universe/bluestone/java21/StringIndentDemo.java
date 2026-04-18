package com.universe.bluestone.java21;

public class StringIndentDemo {
    public static void main(String[] args) {
        String text = "Hello\nWorld";
        System.out.println("Original Text:");
        System.out.println(text);

        String indentedText = text.indent(4);
        System.out.println("\nIndented Text:");
        System.out.println(indentedText);

        String unindentedText = indentedText.indent(-4);
        System.out.println("\nUnindented Text:");
        System.out.println(unindentedText);

    }
}

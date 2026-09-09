package com.universe.bluestone.java15;

public class StripIndentExample {
    public static void main(String[] args) {
        // A multi-line string where every line is padded with 8 leading spaces.
        // Line 2 and 3 have additional relative indentation.
        String multiLineText = 
            "        <html>\n" +
            "            <body>\n" +
            "                <p>Hello, World!</p>\n" +
            "            </body>\n" +
            "        </html>";

        // Stripping the common 8-space indentation prefix
        String strippedText = multiLineText.stripIndent();

        System.out.println("--- Original Text ---");
        System.out.println(multiLineText);

        System.out.println("\n--- Stripped Text ---");
        System.out.println(strippedText);
    }
}
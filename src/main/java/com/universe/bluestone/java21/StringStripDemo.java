package com.universe.bluestone.java21;

public class StringStripDemo {
    public static void main(String[] args) {
        String str = "   Hello, World!   ";
        System.out.println("Original String: '" + str + "'");

        String strippedStr = str.strip();
        System.out.println("Stripped String: '" + strippedStr + "'");

        String leadstrippedStr = str.stripLeading();
        System.out.println("Leading Stripped String: '" + leadstrippedStr + "'");

        String trailstrippedStr = str.stripTrailing();
        System.out.println("Trailing Stripped String: '" + trailstrippedStr + "'");

        String trimStr = str.trim();
        System.out.println("Trim  String: '" + trimStr + "'");
    }
}

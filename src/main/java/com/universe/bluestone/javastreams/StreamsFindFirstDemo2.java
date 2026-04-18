package com.universe.bluestone.javastreams;

public class StreamsFindFirstDemo2 {

    public static void main(String[] args) {
        String[] strArray = {"I", "Love", "Stack", "Overflow"};

        String result = java.util.Arrays.stream(strArray)
                .filter(s -> s.length() > 4)
                .findFirst()
                .orElse("No match found");

        System.out.println(result);
    }
}

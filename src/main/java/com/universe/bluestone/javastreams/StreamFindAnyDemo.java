package com.universe.bluestone.javastreams;

import java.util.Arrays;

public class StreamFindAnyDemo {

    public static void main(String[] args) {
        String[] strArray = {"I", "Love", "Stack", "Overflow"};

        strArray[0] = "I";
        strArray[1] = "Love";
        strArray[2] = "Stack";
        strArray[3] = "Overflow";

        System.out.println("==========>"+ Arrays.stream(strArray).findAny().orElse("Not Found"));

    }
}

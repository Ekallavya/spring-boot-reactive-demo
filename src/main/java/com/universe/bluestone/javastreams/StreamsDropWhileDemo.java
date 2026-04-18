package com.universe.bluestone.javastreams;

import com.universe.bluestone.dto.DataProvider;

public class StreamsDropWhileDemo {
    public static void main(String[] args) {
        DataProvider.getBankList().stream()
                .dropWhile(bank -> bank.getNetWorth() < 5000)
                .forEach(System.out::println);
    }
}

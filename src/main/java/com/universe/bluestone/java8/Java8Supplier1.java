package com.universe.bluestone.java8;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Java8Supplier1 {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {

        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        LocalDateTime time = s.get();

        System.out.println(time);

        Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
        String time2 = s1.get();

        System.out.println(time2);
        Supplier<String> randomStringSupp=() -> String.valueOf(new Random().nextLong());
        
        System.out.println("%$"+randomStringSupp.get());
        
        Supplier<Integer> randomNumbersSupp=() -> new Random().nextInt(10);
        Stream.generate(randomNumbersSupp)
                        .limit(5)
                        .forEach(System.out::println);

    }

}
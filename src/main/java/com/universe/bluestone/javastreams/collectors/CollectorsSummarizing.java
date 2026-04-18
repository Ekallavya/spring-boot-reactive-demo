package com.universe.bluestone.javastreams.collectors;
import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsSummarizing {
    public static void main (String[] args) {

        Stream<BigDecimal> s = Stream.iterate(
                            BigDecimal.ONE, bigDecimal ->
                                       bigDecimal.add(BigDecimal.ONE))
                                      .limit(10).peek(System.out::println);
        
        Stream<BigDecimal> s1 = Stream.iterate(
                BigDecimal.ONE, bigDecimal ->
                           bigDecimal.add(BigDecimal.ONE))
                          .limit(10).peek(System.out::println);

        DoubleSummaryStatistics d = s.collect(Collectors.summarizingDouble(BigDecimal::doubleValue));
        DoubleSummaryStatistics d1 = s1.collect(Collectors.summarizingDouble(o->o.doubleValue()));
        
        System.out.println(d);
        System.out.println( " min :"+d.getMin());
        System.out.println( " max :"+d.getMax());
        System.out.println( " sum :"+d.getSum());
        System.out.println( " Avg :"+d.getAverage());
        System.out.println( "count:"+d.getCount());
        
        System.out.println(d1);
    }
}
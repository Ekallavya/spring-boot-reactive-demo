package com.universe.bluestone.javastreams.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsPartitioningBy {

	public static void main(String[] args) {
		Stream.of("I", "Love", "Stack Overflow")
	      .collect(Collectors.partitioningBy(s -> s.length() > 3))
	      .forEach((k, v) -> System.out.println(k + " => " + v));

	}

}

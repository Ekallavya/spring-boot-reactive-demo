package com.universe.bluestone.javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPeekDemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		 
		Stream<Integer> peekStream=list.stream().peek( System.out::println );   //prints nothing

		System.out.println(peekStream.findFirst());
		System.out.println("===============");
		List<Integer> newList = list.stream().peek(System.out::println).collect(Collectors.toList());
		 
		System.out.println(newList);
		
		

	}

}

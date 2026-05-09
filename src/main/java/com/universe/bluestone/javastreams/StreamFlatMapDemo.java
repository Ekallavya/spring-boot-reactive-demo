package com.universe.bluestone.javastreams;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMapDemo {

	public static void main(String[] args) {
		
		List<Integer> list1 = List.of(2,4,6,8,10,12);
		List<Integer> list2 = List.of(3,6,9,12,15,18);
		List<Integer> list3 = List.of(4,8,12,16,20,24);

		List<List<Integer>> listOfList = List.of(list1,list2,list3);


		listOfList.stream().flatMap(l-> l.stream()).forEach(System.out::println);
		System.out.println("----------------------------------");
		listOfList.stream().flatMap(Collection::stream).forEach(System.out::println);
		System.out.println("----------------------------------");
		listOfList.stream().flatMap(l-> Stream.of(l)).forEach(System.out::println);
		System.out.println("----------------------------------");
		
		
		
		
		
	}

}

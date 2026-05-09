package com.universe.bluestone.javastreams;

import java.util.Arrays;
import java.util.List;

public class StreamNoneMatchDemo {

	public static void main(String[] args) {
		
		List<Integer> inList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println("List :"+inList);
		Integer[] arr = inList.toArray(new Integer[inList.size()]);
		System.out.println("Array :"+arr);
		System.out.println("Array :"+arr.toString());
		System.out.println("Array :"+Arrays.toString(arr));
		
		boolean noneMatch = inList.stream().noneMatch(f-> f.intValue()<0);
		
		System.out.println("noneMatch :"+noneMatch);

	}

}

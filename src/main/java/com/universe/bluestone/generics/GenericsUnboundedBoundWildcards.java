package com.universe.bluestone.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsUnboundedBoundWildcards {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3); ints.add(5); ints.add(10);
		printData(ints);
		
	}


	public static void printData(List<?> list){
		for(Object obj : list){
			System.out.print(obj + "::");
		}
	}
}

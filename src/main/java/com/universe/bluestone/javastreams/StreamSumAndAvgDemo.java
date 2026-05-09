package com.universe.bluestone.javastreams;

import java.util.ArrayList;
import java.util.List;

public class StreamSumAndAvgDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=1;i<101;i++) {
			list.add(i);
		}

		System.out.println("sum of the list values :"+list.stream().mapToInt(Integer::intValue).sum());
		
		System.out.println("avg of the list values :"+list.stream().mapToInt(Integer::intValue).average());
		int sum = list.stream().mapToInt(i-> i.intValue()).sum();
		System.out.println("sum of the list values :"+sum);
		
		
	}

}

package com.universe.bluestone.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class CollectionSortingTest {

	public static void main(String[] args) {
		
		List<Integer> randomList = new ArrayList<>();
		List<Integer> tempList = new ArrayList<>();
		Random random = new Random();
		
		for(int i=0; i<100; i++){
			randomList.add(random.nextInt(100));
		}
		
		System.out.println("size :"+randomList.size());
		System.out.println(randomList);
		System.out.println("Min:"+Collections.min(randomList));
		Collections.sort(randomList);
		
		System.out.println(randomList);
		
		System.out.println("Max:"+Collections.max(randomList));
		
		TreeSet<Integer> set = new TreeSet<>();
		
		set.addAll(randomList);
		
		System.out.println(set);
		
		tempList.add(Integer.MAX_VALUE);
		tempList.add(Integer.MIN_VALUE);
		
		System.out.println(tempList);
		
		Collections.fill(tempList, Integer.MAX_VALUE);
		
		System.out.println(tempList);
		tempList.clear();
		
		List<Integer> list = new ArrayList<>();
		list.add(1001);
		list.add(1002);
		Collections.copy(randomList, list);
		System.out.println(randomList);
		
		List<String> srcList = new ArrayList<String> ();
		List<String> dtnList = new ArrayList<String> ();
		
		dtnList.add("1");
		dtnList.add("2");
		dtnList.add("3");
		
		
		
		srcList.add("A");
		srcList.add("B");
		srcList.add("C");
		
		//dtnList.clear();
		
		Collections.copy(dtnList, srcList);
				
		System.out.println(dtnList);

	}

}

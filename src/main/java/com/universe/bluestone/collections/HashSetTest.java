package com.universe.bluestone.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<Integer>  hashSet = new HashSet<>();
		Random random = new Random();
		for(int i=0; i<61; i++){
			hashSet.add(random.nextInt(1000));
		}
		
		// No insertion order
		System.out.println("HashSet :"+hashSet);
		
		hashSet.add(null); // null is always at head 
		System.out.println("HashSet :"+hashSet);
		
		hashSet.remove(null);
		
		//by default ascedning order
		TreeSet<Integer>  treeSet = new TreeSet<>(hashSet);
		System.out.println("TreeSet :"+treeSet);
		// returns headElement
		System.out.println("first :"+treeSet.first());
		// return tail element
		System.out.println("last :"+treeSet.last());
		// returns immediate greatest element or same element if exist
		System.out.println("celling :"+treeSet.ceiling(50));
		// returns immediate greatest element or null
		System.out.println("higher  :"+treeSet.higher(400));
		// returns immediate leaest element or same element if exist
		System.out.println("floor :"+treeSet.floor(100));
		// returns immediate leaest element or  null
		System.out.println("lower :"+treeSet.lower(89));
		System.out.println("headSet :"+treeSet.headSet(500,true));
		System.out.println("tailSet :"+treeSet.tailSet(600,true));
		System.out.println("subSet :"+treeSet.subSet(500, 600));
		// remove and reutn head element
		System.out.println("pollFirst :"+treeSet.pollFirst());
		//remove and return tail element
		System.out.println("pollLast :"+treeSet.pollLast());
		Integer[] intarr = treeSet.toArray(new Integer[treeSet.size()]);
		System.out.println("toArray :"+Arrays.toString(intarr));
		
		System.out.println("Program Done");
		
	}

}

package com.universe.bluestone.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class GenericsLowerBoundWildcards {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3); ints.add(5); ints.add(10);
		
		
	}

	public static void addIntegers(List<? super Collection> list){
		list.add(new ArrayList());
		list.add(new LinkedList());
		//list.add(new Object());//error
	}
	
	
	/*
	 * bounded and unbounded wildcards in generics are used to bound any Type. Type
	 * can be upper bounded by using <? extends T> where all Types must be sub-class
	 * of T or lower bounded using <? super T> where all Types required to be the
	 * super class of T, here T represent the lower bound
	 * 
	 */
}
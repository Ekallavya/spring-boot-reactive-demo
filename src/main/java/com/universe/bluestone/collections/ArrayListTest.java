package com.universe.bluestone.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		
		for(int i = 0; i<10;i++){
			
			if(i%2 != 0) list.add(i);
			else list.add(i*3);
		}
		
		
		System.out.println(list);
		
		list.add(null);
		list.add(null);
		
		//list.removeAll(null);//throws Exception
		list.remove(null);// removes first encounter of null object 
		list.remove(null);
		System.out.println("Remove null :"+list);
		
		temp.add(null);
		//list.removeAll(temp);// this will work and removes all null objects in the list
		
		list.removeAll(Collections.singletonList(null));// this will work and removes all null objects in the list
		
		System.out.println(list);
		temp.clear();
		
		temp.add(1);temp.add(2);temp.add(5);
		
		list.retainAll(temp);
		System.out.println("retain all");
		
		System.out.println(list);
		
		list.clear();
		
		for(int i = 0; i<10;i++){
			
			if(i%2 != 0) list.add(i);
			else list.add(null);
		}
		
		Iterator<Integer> iterator = list.iterator();
		System.out.println(iterator);
		
		while(iterator.hasNext()) System.out.print(""+iterator.next()+",");
		
		
		Object obj = list.clone();
		
		System.out.println("\nafter list clone");
		
		System.out.println(obj);
		System.out.println("\nafter list clone");
		temp = (ArrayList<Integer>)list.clone();
		
		System.out.println(temp);
		
		Spliterator<Integer> spliterator = list.spliterator();
		
		
		List<String>  arrList = new ArrayList<>();
		int size = arrList.size();
		System.out.println("size :"+size);
		System.out.println("Just after Creating List:"+arrList);
		for(int i=0;i<5;i++) arrList.add(null); 
		System.out.println("size :"+size);
		System.out.println("after adding null objects:"+arrList);
		System.out.println("size :"+size);
		for(int i=0; i <= arrList.size();i++) arrList.remove(i);
		size = arrList.size();
		System.out.println("\nafter removing null objects:"+arrList);
		
		arrList.removeAll(Collections.singleton(null));
		
		System.out.println("\nremoving null objects:"+arrList);
		size = arrList.size();
		System.out.println("size :"+size);
		
		arrList.clear();
		
		arrList.add("ABC");arrList.add("CDE");arrList.add("FGH");arrList.add("IJK");arrList.add("LMN");arrList.add("OPQ");arrList.add("RST");arrList.add("UVW");arrList.add("XYZ");
		System.out.println("\n List:"+arrList);
		
		String[] strArr = new String[arrList.size()];
		
		arrList.toArray(strArr);
		
		System.out.println("\n Array:"+Arrays.toString(strArr));
		
		List<String> asList = Arrays.asList("ABC","CDE","DEF",null);
		
		System.out.println("\n List:"+asList);
		
		//asList.add("GHJ"); throws unsupported exception , since asList is immutable
		

	}

}

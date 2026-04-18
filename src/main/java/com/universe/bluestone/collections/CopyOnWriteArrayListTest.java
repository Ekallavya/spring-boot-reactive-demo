package com.universe.bluestone.collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/**
 * 
 * CopyOnWriteArrayList is thread safe and synchronized.
 * The operations like add, set on  CopyOnWriteArrayList are made by taking fresh copy.
 * While iterating CopyOnWriteArrayList, we can not add are remove or modify.(iterator fail safe)
 * CopyOnWriteArrayList is used in collection framework and this is available from jdk1.5.
 *
 */
public class CopyOnWriteArrayListTest {
	public static void main(String... args){
		CopyOnWriteArrayList<String> ob= new CopyOnWriteArrayList<>();
		
		ob.add("A");
		ob.add("B");
		ob.add("C");
		ob.add("D");
		ob.add("E");
		
		ob.addIfAbsent("A");
		
		ob.remove("B");
		Iterator<String> itr= ob.listIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
package com.universe.bluestone.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

public class CollectionsTest {

	@SuppressWarnings({ "unchecked", "unused" })
	public static void main(String[] args) {
		
		List<Integer> list =	Collections.EMPTY_LIST;;
		Map<Integer,String> map = Collections.EMPTY_MAP;
		Set<Integer> set = Collections.EMPTY_SET;
		//list.add(1); since Immutable List ,throws UnsupportedOperationException
		// applicable same to set and map
		ListIterator<Object> ListIterator = Collections.emptyListIterator();
		Enumeration<Object> enumeration = Collections.emptyEnumeration();
		Iterator<Object> iterator = Collections.emptyIterator();
		Map<Object, Object>  emptyMap = Collections.emptyMap();
		NavigableSet<Object> navigSet = Collections.emptyNavigableSet();
		NavigableMap<Object, Object> navigMap = Collections.emptyNavigableMap();
		SortedMap<Object, Object> sortedMap = Collections.emptySortedMap();
		SortedSet<Object> sortSet = Collections.emptySortedSet();
		Set<Object>  empSet = Collections.emptySet();
		List<Object>  emptyList= Collections.emptyList();
		//emptyList.add(1); since Immutable List ,throws UnsupportedOperationException
		
		
		List<Integer> arrList = new ArrayList<>();
		
		for(int i=0;i<20;i++) arrList.add(i*2);
		System.out.println(arrList);
		
		Collection<Integer> immuCollection = Collections.unmodifiableCollection(arrList);
		//Collections.unmodifiableList(list)
		//Collections.unmodifiableMap(m)
		
		//immuCollection.add(21);//throws unsupportedOperation
		
		// The above same scenario applicable to List,Set,SortedSet,NagivableSet,HashMap,NavigableHashMap
		
		
		
		List checkedList= Collections.checkedList(new ArrayList(), String.class);
		
		checkedList.add("A");
		
		//checkedList.add(1);//throws classCast exception
		// The above same scenario applicable to Collection,List,Queue,Set,SortedSet,NagivableSet,HashMap,NavigableHashMap
		
		System.out.println(checkedList);
		
		//Collections.asLifoQueue(deque);
		
		int index = Collections.binarySearch(arrList, 10);
		
		System.out.println("pos :"+index);
		
		index= Collections.indexOfSubList(arrList, Arrays.asList(4,6,8));
		
		System.out.println("pos :"+index);
		
		index= Collections.indexOfSubList(arrList, Arrays.asList(4,6,7,8));
		
		System.out.println("pos :"+index);//returns -1 , since sublist does not exist in  main list
		
		Collections.reverse(arrList);
		
		System.out.println(arrList);
		
		Collections.shuffle(arrList);
		
		System.out.println(arrList);
		
		Collections.sort(arrList);
		
		System.out.println(arrList);
		
		Collections.rotate(arrList, 3);//arrList ,distance
		
		System.out.println(arrList);
		
		arrList.add(2);
		arrList.add(2);
		arrList.add(2);
		
		int frequency = Collections.frequency(arrList, 2);//how many times occur
		
		System.out.println("frequency :"+frequency);
		
		System.out.println(Collections.max(arrList));
		System.out.println(Collections.min(arrList));
		
		Collections.fill(arrList, 1);
		
		System.out.println(arrList);
		arrList.add(2);
		arrList.add(2);
		arrList.add(2);
		
		Set<Integer>  hset = new HashSet<>();
		
		//TODO 
		//Collections.reverseOrder((a,b)-> a.equals(b));
		//System.out.println(arrList);
		
		arrList = Collections.nCopies(25, 5); //size,value
		
		System.out.println(arrList);
		
		List<Integer> syncList = Collections.synchronizedList(arrList);
		// The above same scenario applicable to List,Set,SortedSet,NagivableSet,HashMap,NavigableHashMap
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		
		
		boolean isDisjoint = Collections.disjoint(list1, list2);
		System.out.println("isDisjoint :"+isDisjoint);
		
		list2.add(4);

		isDisjoint = Collections.disjoint(list1, list2);
		System.out.println("isDisjoint :"+isDisjoint);
	}
	
	
	
	

}

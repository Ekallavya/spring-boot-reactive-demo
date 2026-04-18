package com.universe.bluestone.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		LinkedList<Integer> temp = new LinkedList<>();
		
		for(int i = 0; i<100;i++){
			
			if(i%2 != 0) list.add(i);
			else list.add(null);
		}
				
		System.out.println(list);
		
		//list.removeAll(null);//throws Exception
		list.remove(null);//does not effect anything 
		
		System.out.println("=>"+list);
		
		temp.add(null);
		list.removeAll(temp);// this will work and removes all null objects in the list
		
		
		list.add(null);
		list.add(null);
		list.add(null);
		System.out.println("==>"+list);
		list.removeAll(Collections.singletonList(null));// this will work and removes all null objects in the list
		
		System.out.println("#>"+list);
		temp.clear();
		
		temp.add(1);temp.add(2);temp.add(5);
		
		list.retainAll(temp);
		System.out.println("retain all");
		
		System.out.println("##>"+list);
		
		list.clear();
		
		for(int i = 0; i<100;i++){
			
			if(i%2 != 0) list.add(i);
			else list.add(null);
		}
		
		Iterator<Integer> iterator = list.iterator();
		System.out.println("Iterator:"+iterator);
		
		while(iterator.hasNext()) System.out.print(""+iterator.next()+",");
		
		
		Object obj = list.clone();
		
		System.out.println("\nafter list clone");
		
		System.out.println(obj);
		System.out.println("\nafter list clone");
		temp = (LinkedList<Integer>)list.clone();
		
		System.out.println(temp);
		
		list.clear();
		
		for(int i = 0; i<100;i++){
			
			list.add(i);
		}
		System.out.println("\n clear and fresh insert");
		System.out.println(list);
		for(int j=0; j<150;j++){
			
			if(j%2 != 0) list.addFirst(j);
			else list.addLast(j);
			
		}
		
		System.out.println("\nadd First ,addLast");
		
		System.out.println(list);
		
		
		for(int j=1; j<52;j++){
			
			if(j%2 != 0) list.removeFirst();
			else list.removeLast();
			
		}
		
		System.out.println("\n remove First , removeLast");
		
		System.out.println(list);
		
		
		Integer peek =list.peek();//  retrive head element and does not remove , throws exception if list is empty
		
		System.out.println("peak :"+peek);
		
		//list.clear();
		Integer first =list.getFirst();// retrive first element,throws exception if list is empty
		
		System.out.println("first :"+first);
		
		Integer last =list.getLast();// retrive tail element,throws exception if list is empty
		
		System.out.println("last :"+last);
		
		Integer peekFirst =list.peekFirst();// retrive head element and does not remove, return null if empty list
		
		System.out.println("peekFirst :"+peekFirst);
		
		Integer peekLast =list.peekLast();// retrive tail element and does not remove, return null if empty list
		
		System.out.println("peekLast :"+peekLast);
		
		Integer poll =list.poll();// retrive head element and  remove ,returns null if emptylist , no exception occured 
		
		System.out.println("poll :"+poll);
		
		Integer pollFirst =list.pollFirst();// retrive head element and  remove ,returns null if emptylist , no exception occured 
		
		System.out.println("pollFirst :"+pollFirst);
		
		Integer pollLast =list.pollLast();// retrive last element and  remove ,returns null if emptylist , no exception occured 
		
		System.out.println("pollLast :"+pollLast);
		
		System.out.println(list);

		Integer pop =list.pop();// retrive first(head) element and  remove ,throws exception if emptylist 
		
		System.out.println("pop :"+pop);
		
		System.out.println(list);
		
		list.push(new Integer(200));// add element to head ,returns void
		
		System.out.println(list);
		
		list.add(new Integer(300));// add element to tail ,returns boolean
		
		System.out.println(list);
		
		list.offer(new Integer(400));// add element to tail and retunrs boolean
		
		System.out.println(list); 
		
		list.offerFirst(new Integer(500));// add element to head ,returns boolean
		
		System.out.println(list);
		
		list.offerLast(new Integer(600));// add element to tail ,returns boolean
		
		System.out.println(list);
		
		
		
		

	}

}

package com.universe.bluestone.collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;

public class DequeueTest {

	public static void main(String[] args) {
		

		
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		ArrayDeque<Integer> temp = new ArrayDeque<>();
		
		for(int i = 0; i<100;i++){
			
			deque.add(i);
			deque.add(null);//throws NullPonterException
			
		}
		
		System.out.println(deque);
		
		//deque.removeAll(null);//throws Exception
		deque.remove(null);//does not effect anything 
		
		System.out.println(deque);
		
		//deque.removeAll(temp);// this will work and removes all null objects in the deque
		
		deque.removeAll(Collections.singletonList(null));// this will work and removes all null objects in the deque
		
		System.out.println(deque);
		temp.clear();
		
		temp.add(1);temp.add(2);temp.add(5);
		
		deque.retainAll(temp);
		System.out.println("retain all");
		
		System.out.println(deque);
		
		deque.clear();
		
		for(int i = 0; i<100;i++){
			
			 deque.add(i);
			
		}
		
		Iterator<Integer> iterator = deque.iterator();
		System.out.println(iterator);
		
		while(iterator.hasNext()) System.out.print(""+iterator.next()+",");
		
		
		Object obj = deque.clone();
		
		System.out.println("\nafter deque clone");
		
		System.out.println(obj);
		System.out.println("\nafter deque clone");
		temp = (ArrayDeque<Integer>)deque.clone();
		
		System.out.println(temp);
		
		deque.clear();
		
		for(int i = 0; i<100;i++){
			
			deque.add(i);
		}
		System.out.println("\n clear and fresh insert");
		System.out.println(deque);
		for(int j=0; j<150;j++){
			
			if(j%2 != 0) deque.addFirst(j);
			else deque.addLast(j);
			
		}
		
		System.out.println("\nadd First ,addLast");
		
		System.out.println(deque);
		
		
		for(int j=1; j<52;j++){
			
			if(j%2 != 0) deque.removeFirst();
			else deque.removeLast();
			
		}
		
		System.out.println("\n remove First , removeLast");
		
		System.out.println(deque);
		
		
		Integer peek =deque.peek();//  retrive head element and does not remove , throws exception if deque is empty
		
		System.out.println("peak :"+peek);
		
		//deque.clear();
		Integer first =deque.getFirst();// retrive first element,throws exception if deque is empty
		
		System.out.println("first :"+first);
		
		Integer last =deque.getLast();// retrive tail element,throws exception if deque is empty
		
		System.out.println("last :"+last);
		
		Integer peekFirst =deque.peekFirst();// retrive head element and does not remove, return null if empty deque
		
		System.out.println("peekFirst :"+peekFirst);
		
		Integer peekLast =deque.peekLast();// retrive tail element and does not remove, return null if empty deque
		
		System.out.println("peekLast :"+peekLast);
		
		Integer poll =deque.poll();// retrive head element and  remove ,returns null if emptydeque , no exception occured 
		
		System.out.println("poll :"+poll);
		
		Integer pollFirst =deque.pollFirst();// retrive head element and  remove ,returns null if emptydeque , no exception occured 
		
		System.out.println("pollFirst :"+pollFirst);
		
		Integer pollLast =deque.pollLast();// retrive last element and  remove ,returns null if emptydeque , no exception occured 
		
		System.out.println("pollLast :"+pollLast);
		
		System.out.println(deque);

		Integer pop =deque.pop();// retrive first(head) element and  remove ,throws exception if emptydeque 
		
		System.out.println("pop :"+pop);
		
		System.out.println(deque);
		
		deque.push(new Integer(200));// add element to head ,returns void
		
		System.out.println(deque);
		
		deque.add(new Integer(300));// add element to tail ,returns boolean
		
		System.out.println(deque);
		
		deque.offer(new Integer(400));// add element to tail ,returns boolean
		
		System.out.println(deque); 
		
		deque.offerFirst(new Integer(500));// add element to head ,returns boolean
		
		System.out.println(deque);
		
		deque.offerLast(new Integer(600));// add element to tail ,returns boolean
		
		System.out.println(deque);
		
		
		
		

	

	}

}

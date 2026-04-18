package com.universe.bluestone.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueTest {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		PriorityQueue<Integer> temp = new PriorityQueue<>();
		
		for(int i = 0; i<100;i++){
			
			if(i%2 != 0) queue.add(i);
			else queue.add(0);
		}
		
		
		System.out.println(queue);
		
		//queue.removeAll(null);//throws Exception
		queue.remove(null);//does not effect anything 
		
		System.out.println(queue);
		
		
		//queue.removeAll(temp);// this will work and removes all null objects in the queue
		
		queue.removeAll(Collections.singletonList(null));// this will work and removes all null objects in the queue
		
		System.out.println(queue);
		temp.clear();
		
		temp.add(1);temp.add(2);temp.add(5);
		
		queue.retainAll(temp);
		System.out.println("retain all");
		
		System.out.println(queue);
		
		queue.clear();
		
		for(int i = 0; i<100;i++){
			
			if(i%2 != 0) queue.add(i);
			
		}
		
		Iterator<Integer> iterator = queue.iterator();
		System.out.println(iterator);
		
		while(iterator.hasNext()) System.out.print(""+iterator.next()+",");
		
		
		
		System.out.println(temp);
		
		queue.clear();
		
		for(int i = 0; i<100;i++){
			
			queue.add(i);
		}
		System.out.println("\n clear and fresh insert");
		System.out.println(queue);
		for(int j=0; j<150;j++){
			
			 queue.offer(j);
			
		}
		
		System.out.println(queue);
		
		
		Integer peek =queue.peek();//  retrive head element and does not remove , throws exception if queue is empty
		
		System.out.println("peak :"+peek);
		
		//queue.clear();
		
		Integer poll =queue.poll();// retrive head element and  remove ,returns null if  queue is empty, no exception occurred 
		
		System.out.println("poll :"+poll);
		
		
		System.out.println(queue);

		//Integer pop =queue.pop();// does not support this method 
		
		
		System.out.println(queue);
		
		
		queue.add(300);// add element to tail ,returns boolean
		
		System.out.println(queue);
		
		queue.offer(400);// add element to tail,returns  boolean 
		
		System.out.println(queue); 
		
		
		
	}

}

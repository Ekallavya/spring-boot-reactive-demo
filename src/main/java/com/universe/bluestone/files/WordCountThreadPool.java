package com.universe.bluestone.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class WordCountThreadPool {
	
	public static ConcurrentHashMap<String,Integer> concurHashMap = new ConcurrentHashMap<>();
	
  public static void main(String[] args) throws FileNotFoundException {
    HashMap<String,Integer> map = new HashMap<>();  // word --> # of occurrences
    
    // read each word from the file
    Scanner in = new Scanner(new File("D:/tmp/miscelineaswords.txt"));
    while (in.hasNext()) {
      String word = in.next();
      if(word!=null)
      CharCount.process(word);
      
      if(map.containsKey(word)) {
        // if we have already seen this word before,
        // increment its count by one
        Integer count = (Integer)map.get(word);
        map.put(word, new Integer(count.intValue() + 1));
      } else {
        // we haven't seen this word, so add it with count of 1
        map.put(word, new Integer(1));
      }
    }

    // now print out every word in the book, along with its count,
    // in alphabetical order
    ArrayList<String> arraylist = new ArrayList<>(map.keySet());
    Collections.sort(arraylist);
    
    for (int i = 0; i < arraylist.size(); i++) {
      String key = (String)arraylist.get(i);
      Integer count = (Integer)map.get(key);
      System.out.println("Word :"+key + " , Count :" + count);
    }
    
    do{
    }while(CharCount.threadPoolExer.getActiveCount()!=0);
    
    if(!concurHashMap.isEmpty()){
    	
    	concurHashMap.forEach((a,b)->{System.out.println("Char :"+a+" ,count:"+b); });
    }
    
    //System.exit(0);
    Runtime.getRuntime().exit(0);


  }
}


class CharCount1{
	
	static ArrayBlockingQueue<Runnable>  blockingQueue = new ArrayBlockingQueue<>(1000);
	
	static int corePoolSize = 5, maximumPoolSize = 100;
	static long keepAliveTime = 1000L;
	
	static ThreadPoolExecutor  threadPoolExer = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, TimeUnit.MICROSECONDS, blockingQueue);
	
	public static void process(String word){
		
		threadPoolExer.execute(new MyRunnable(word));
		
	}
	
	
	
}

class MyRunnable1 implements Runnable{
	
	String word ;
	
	MyRunnable1(String word){
		this.word = word;
	}
	public void run(){
		
		char[] charArr = word.toCharArray();
		
		for(char ch:charArr){
			String str = String.valueOf(ch);
			if(WordCountThreadPool.concurHashMap.containsKey(str)){
				
				WordCountThreadPool.concurHashMap.put(str, WordCountThreadPool.concurHashMap.get(str)+1);
			}else{
				WordCountThreadPool.concurHashMap.put(str, 1);
			}
		}
	}
	
}
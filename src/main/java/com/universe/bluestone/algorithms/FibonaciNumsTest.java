package com.universe.bluestone.algorithms;

import java.util.Arrays;
import java.util.List;

/** n = (n-1)+(n-2) */
public class FibonaciNumsTest {

	public static void main(String[] args) {
		// Print 100 fibonacci numbers
		
		Long[]  fiboArray = new Long[50];
		List<Long> fiboList ;
		fiboArray[0] = 0L;
		fiboArray[1] = 1L;
		
		/*
		 * for(int i=2;i<50;i++){
		 * 
		 * fiboArray[i]=fiboArray[i-1]+fiboArray[i-2];
		 * 
		 * }
		 */
		
		for(int i=0;i<50;i++){
			
			if(i==0) fiboArray[i]=0L;
			else if(i==1) fiboArray[i]=1L;
			else fiboArray[i]=fiboArray[i-1]+fiboArray[i-2];
			
		}
		fiboList = Arrays.asList(fiboArray);
		System.out.println(Arrays.toString(fiboArray));
		System.out.println(fiboList);
		
		
		

	}

}

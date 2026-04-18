package com.universe.bluestone.algorithms;

import java.util.Arrays;

public class SortOnesAndZeros {

	public static void main(String[] args) {
		int[] arr = {1,0,1,0,1,0,0,1,0,0,1,1,1,0,1,0,0,1,1};
		
		int j=0;
	
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				arr[j++]=0;
			}	
			
		}
		while(j<arr.length){
			arr[j++]=1;
		}
		
	
		System.out.println(Arrays.toString(arr));
	}

}

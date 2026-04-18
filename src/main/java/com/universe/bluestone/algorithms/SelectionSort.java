package com.universe.bluestone.algorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int array[] = {12,9,4,99,120,1,3,10,13};

		int temp;
		
		for(int j=array.length;j>0;j--){
			for(int i=0;i<j-1;i++){

				if(array[i]>array[i+1]){
					temp = array[i+1];
					array[i+1] = array[i];
					array[i] = temp;
				}
			}
		}
		System.out.println(array);
		System.out.println(Arrays.toString(array));
	}
}

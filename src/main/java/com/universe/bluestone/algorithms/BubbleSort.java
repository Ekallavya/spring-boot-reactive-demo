package com.universe.bluestone.algorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int array[] = {12,9,4,99,120,1,3,10,13};

		boolean isSortRequired = true;
		int temp;
		while(isSortRequired){
			isSortRequired = false;
			for(int i=0;i<array.length -1;i++){

				if(array[i]>array[i+1]){
					temp = array[i+1];
					array[i+1] = array[i];
					array[i] = temp;
					isSortRequired = true;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}

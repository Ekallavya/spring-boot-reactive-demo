package com.universe.bluestone.algorithms;

import java.util.Arrays;

public class ExchangeSort {

	public static void main(String[] args) {
		int array[] = {12,9,4,99,120,1,3,10,13};

		int temp;
		
		for(int i=0;i<array.length-1;i++){
			for(int j=i+1;j<array.length;j++){

				if(array[i]>array[j]){
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}

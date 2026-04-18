package com.universe.bluestone.algorithms;

public class FindMissingNumber {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8,9,10,11,13};
		int arrSize = array.length;
	
		// The sum of first n natural numbers = n(n+1)/2
		long total = ((arrSize+1) * (arrSize+2))/2;
		long sum =0;
		for(int i=0;i<array.length;i++){
			sum = sum+array[i];
		}

		System.out.println("MissingNumber :"+(total -sum));
	}

}

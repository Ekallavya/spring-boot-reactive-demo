package com.universe.bluestone.algorithms;

public class BinarySearch{

	public static void main(String[] args){

		int key = 75;
		int array[] = {15,16,23,43,44,45,65,75,88};
		//The binary search method   
		binarySearch (array, 0, 9, key);  
	}
	public static void binarySearch(int[ ] array, int lowerbound, int upperbound, int key){
		int position;
		int comparisonCount = 1;    // counting the number of comparisons (optional)

		// To start, find the subscript of the middle position.
		position = ( lowerbound + upperbound) / 2;

		while((array[position] != key) && (lowerbound <= upperbound)){
			comparisonCount++;
			if (array[position] > key) {            // If the number is > key, ..
				// decrease position by one. 
				upperbound = position - 1;   
			}else{                                                        
				lowerbound = position + 1;    // Else, increase position by one.
			}
			position = (lowerbound + upperbound) / 2;
		}
		if (lowerbound <= upperbound){
			System.out.println("The number was found in array subscript" + position);
			System.out.println("The binary search found the number after " + comparisonCount +
					"comparisons.");
		}
		else
			System.out.println("Sorry, the number is not in this array.  The binary search made "
					+comparisonCount  + " comparisons.");
	}
}

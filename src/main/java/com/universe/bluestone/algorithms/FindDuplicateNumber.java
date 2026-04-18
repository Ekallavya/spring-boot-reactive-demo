package com.universe.bluestone.algorithms;

public class FindDuplicateNumber {
//TODO Program not perfect
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8,9,9,11,12};
		int arrSize = array.length;
		int dup = 0;
		for(int i=0; i <arrSize-2; i++) {
			for(int j=i+1;j<arrSize-1;j++) {
				if(array[i]==array[j]) {
					dup =array[i];
							
				}
				
			}
		}
	
	

		System.out.println("DuplicateNumber :"+dup);
	}

}

package com.universe.bluestone.algorithms;

import java.util.Arrays;

public class QuickSort{
	public static void main(String a[]){
		
		int array[] = {12,9,4,99,120,1,3,10,13};
		
		System.out.println("Values Before the sort:"+Arrays.toString(array));
		
		quickSort(array,0,array.length-1);
		
		System.out.println("\nValues After the sort:"+Arrays.toString(array));
	}

	public static void quickSort(int array[],int low, int high){
		int lo = low;
		int hi = high;
		
		if (low >= high) {
			return;
		}
		int mid = array[(lo + hi) / 2];
		
		while (lo < hi) {
			while (lo<hi && array[lo] < mid) {
				lo++;
			}
			while (lo<hi && array[hi] > mid) {
				hi--;
			}
			if (lo < hi) {
				int T = array[lo];
				array[lo] = array[hi];
				array[hi] = T;
			}
		}
		if (hi < lo) {
			int T = hi;
			hi = lo;
			lo = T;
		}
		quickSort(array, low, lo);
		quickSort(array, lo == low ? lo+1 : lo, high);
	}
}
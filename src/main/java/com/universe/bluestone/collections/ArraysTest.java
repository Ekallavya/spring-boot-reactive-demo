package com.universe.bluestone.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArraysTest {

	public static void main(String[] args) {
		
		List<Integer> list1 =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> list2 =Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,10});
		
		List<Integer> randomList = new ArrayList<>();
		List<Integer> tempList = new ArrayList<>();
		Random random = new Random();
		
		for(int i=0; i<100; i++){
			randomList.add(random.nextInt(1000));
			tempList.add(i*2);
		}
		Integer[] intArr = new Integer[randomList.size()];
		
		randomList.toArray(intArr);
		System.out.println(Arrays.toString(intArr));
		int position = Arrays.binarySearch(intArr, 100);// return -ve number if does not exist
		
		System.out.println("Position :"+position);
		
		tempList.toArray(intArr);
		System.out.println(Arrays.toString(intArr));
		// appicable to all primitive types or Objects
		position = Arrays.binarySearch(intArr, 100);
		
		System.out.println("Position :"+position);
		//appicable to all primitive types or Objects
		position = Arrays.binarySearch(intArr, 10, 20, 30);//intArr, fromIndex, toIndex, key
		
		System.out.println("Position :"+position);
		//returns subarry for the given length , applicable all type of primitives and objects
		Integer tempArr[] =Arrays.copyOf(intArr, 10);//parameters : originalArr , newLength
		
		System.out.println("temp[] :"+Arrays.toString(tempArr));
		//appicable to all primitive types or Objects
		tempArr = Arrays.copyOfRange(intArr, 10, 99);//original, from, to
				
		System.out.println("temp[] :"+Arrays.toString(tempArr));
		//appicable to all primitive types or Objects
		System.out.println("array equal :"+Arrays.equals(list1.toArray(), list2.toArray()));
		
		Arrays.fill(tempArr, 25);
		System.out.println("temp[] :"+Arrays.toString(tempArr));
		
		Arrays.fill(tempArr, 10,20,777);//intArr, fromIndex, toIndex, fillvalue
		System.out.println("temp[] :"+Arrays.toString(tempArr));
		//partial sort
		Arrays.sort(tempArr, 0, 30);//intArr, fromIndex, toIndex
		
		System.out.println("temp[] :"+Arrays.toString(tempArr));
		//full sort
		Arrays.sort(tempArr);//intArr
		
		System.out.println("temp[] :"+Arrays.toString(tempArr));
		
		Arrays.fill(tempArr,10,20,88);
		
		Arrays.parallelSort(tempArr,0,34);
		
		System.out.println("temp[] :"+Arrays.toString(tempArr));
		
		Arrays.parallelSort(tempArr);
		
		System.out.println("temp[] :"+Arrays.toString(tempArr));
		
		

		
	}

}

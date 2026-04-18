package com.universe.bluestone.collections;
 
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromList {
	public static void main(String[] args)
	{
		Integer[] arr=new Integer[]{1,2,3,4,3,2,4,2};
		List<Integer> listWithDuplicates = Arrays.asList(arr);

        //Set<Integer> setWithoutDups = listWithDuplicates.stream().collect(Collectors.toSet());
		Set<Integer> setWithoutDups = new HashSet<>(listWithDuplicates);
		setWithoutDups.forEach((i)->System.out.print(" "+i));
	}
}
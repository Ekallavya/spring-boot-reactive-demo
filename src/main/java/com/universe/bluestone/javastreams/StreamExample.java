package com.universe.bluestone.javastreams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class StreamExample {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
		
		
		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();
		
		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		
		//using lambda with Stream API, filter example
		Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
		//using lambda in forEach
		highNums.forEach(p -> System.out.println("High Nums parallel="+p));
		
		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));
		
		

	}

}


//Java 8 stream supports both intermediate and terminal operation.
//
//Intermediate operations are lazy in nature and do not get executed immediately. Terminal operations are not lazy, they are executed as soon as encountered. Intermediate operation is memorized and is called when terminal operation is called.
//
//All Intermediate operations return stream as it just transforms stream into another and terminal operation don�t.
//
//Example of Intermediate operations are:
//
//filter(Predicate)
//map(Function)
//flatmap(Function)
//Sorted(Comparator)
//distinct()
//limit(long n)
//skip(long n)
//Example of terminal operations are :
//
//forEach
//toArray
//reduce
//collect
//min
//max
//count
//anyMatch
//allMatch
//noneMatch
//findFirst
//findAny
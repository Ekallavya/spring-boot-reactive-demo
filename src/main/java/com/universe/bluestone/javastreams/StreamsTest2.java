package com.universe.bluestone.javastreams;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;



public class StreamsTest2 {

	public static void main(String[] args) {
		
		 Map<Integer,String> map = new HashMap<>();
		 map.put(101,"Java");
		 map.put(102,"JDBC");
		 map.put(103,"Servlet");  
		 map.put(104,"JDBC");  
		 map.put(105,"Struts");  
		 map.put(106,"Spring");
		 map.put(107,"SpringBoot"); 
		 map.put(108,"SpringMicorservices"); 
		 map.put(109,"Hibernate"); 
		 map.put(110,"Junit"); 
		 map.put(111,"Git"); 
		 map.put(112,"GitHub"); 
		 map.put(113,"Restful Webservices"); 
		 map.put(114,"SOAP Webservices"); 

		 System.out.println(map);
		 
		 Collection<String> list = map.values();
		 System.out.println(list);
		 
		 Stream<String> stream =list.stream();
		 System.out.println(stream);
		 Collection<Integer> set = map.keySet();
		 
		 Stream<Integer> stream1 =set.stream();
//		stream1.allMatch(predicate)
//		stream1.anyMatch(predicate)
//		stream1.collect(collector)
//		stream1.collect(supplier, accumulator, combiner)
//		stream1.count()
//		stream1.distinct()
//		stream1.filter(predicate)
//		stream1.findAny()
//		stream1.findFirst()
//		stream1.flatMap(mapper)
//		stream1.flatMapToInt(mapper)
//		stream1.forEach(action);
//		stream1.forEachOrdered(action);
//		stream1.limit(maxSize)
//		stream1.peek(action)
//		stream1.reduce(accumulator)
//		stream1.max(comparator)
//		stream1.min(comparator)
//		stream1.noneMatch(predicate)
//		stream1.sequential()
//		stream1.isParallel();
//		stream1.skip(n)
//		stream1.sorted(comparator)
//		stream1.spliterator()
		 System.out.println(stream1);
		
	} 
}

package com.universe.bluestone.javastreams;

import com.universe.bluestone.dto.Actor;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamsExample {

	public static void main(String[] args) {
		
		List<Actor> actorList = Actor.generateActors(5);
		System.out.println("=====>original collections");
		actorList.forEach(actor ->{System.out.println(actor.toString());});
		
		System.out.println("=====> ");
		actorList.stream().forEach(actor ->{System.out.println(actor.toString());});
		
		//Set<Integer> l = new TreeSet<>();
		//Set<Integer> l = new HashSet<>();
		Set<Integer> l = new LinkedHashSet<>();
		l.add(1);
		l.add(10);
		l.add(3);
		l.add(-3);
		l.add(-4);
		

//		l.stream().unordered().forEach(System.out::println);
//		System.out.println("=====> ");
//		l.stream()/* .unordered() */.forEach(System.out::println);
		
		Stream<Integer> srm = l.stream();
		
		srm.forEach(System.out::println);
		System.out.println("=====> ");
		//srm.forEach(i->System.out.println(i));
		
		Stream<String> nameStream = Stream.of("Alice", "Bob", "Chuck");
		System.out.println("=====>ssss ");
		nameStream.peek(String::toLowerCase).forEach(System.out::println);
		
		//Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		//nameStream.peek(System.out::println);
		
		//creating simple list
        List<String> languages = List.of("Java", "C", "PHP", "Scala", "Go");

        //use peek without terminal operation
        languages.stream()
                .peek(System.out::println);
 
		
	}

}

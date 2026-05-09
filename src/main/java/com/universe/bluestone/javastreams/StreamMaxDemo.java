package com.universe.bluestone.javastreams;
 
import com.universe.bluestone.dto.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;


public class StreamMaxDemo {
	public static void main(String args[])
	{
		List<Employee> employeeList = createEmployeeList();
		List<String> employeeFilteredList = employeeList.stream()
		          .filter(e->e.getAge()>20)
		          .map(Employee::getName)
		          .collect(Collectors.toList());
		
		employeeFilteredList.forEach((name)-> System.out.println(name));
		
		//count
		
		employeeList = createEmployeeList();
		long count = employeeList.stream()
		.filter(e->e.getAge()>25)
		.count();
		System.out.println("Number of employees with age 25 are : "+count);
		
		//check by condition
		
		employeeList = createEmployeeList();
		Optional<Employee> e11 = employeeList.stream()
		          .filter(e->e.getName().equalsIgnoreCase("Mary")).findAny();
		    
		System.out.println("=================>findAny ");
		if(e11.isPresent())
			System.out.println(e11.get());
		
		//max
		System.out.println("=================>max ");
		employeeList = createEmployeeList();
		OptionalInt max = employeeList.stream().
				          mapToInt(Employee::getAge).max();
		        
		if(max.isPresent())
			System.out.println("Maximum age of Employee: "+max.getAsInt());
		System.out.println("=================>sort ");
		employeeList = createEmployeeList();
		//employeeList.sort((e1,e2)->e1.getAge()-e2.getAge());
		employeeList.sort((e1,e2)->{
			if(e1.getAge()-e2.getAge() > 0) return 1;
			if(e1.getAge()-e2.getAge() == 0) return 0;
			if(e1.getAge()-e2.getAge() < 0) return -1;
			return 0;});
		employeeList.forEach(System.out::println);
		
		
		 List<Long> longList = Arrays.asList(2343L, 2332L, 876567L);
		 
		 System.out.println("maxLong :"+longList.stream().mapToLong(l->l.longValue()).max());
		
	}
	
	public static List<Employee> createEmployeeList()
	{
		List<Employee> employeeList=new ArrayList<>();
 
		Employee e1=new Employee("John",21);
		Employee e2=new Employee("Martin",19);
		Employee e3=new Employee("Mary",31);
		Employee e4=new Employee("Stephan",18);
		Employee e5=new Employee("Gary",26);
 
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
 
		return employeeList;
	}
}
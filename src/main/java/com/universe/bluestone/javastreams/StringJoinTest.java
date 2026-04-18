package com.universe.bluestone.javastreams;
 
import com.universe.bluestone.dto.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StringJoinTest {
	public static void main(String args[])
	{
	
		
		List<Employee> employeeList = createEmployeeList();
		List<String> employeeNames = employeeList
				                     .stream()
				                     .map(Employee::getName)
				                     .collect(Collectors.toList());
		String employeeNamesStr = String.join(",",employeeNames);
		System.out.println("Employees are: "+employeeNamesStr);
		

	
	}
	
	public static List<Employee> createEmployeeList()
	{
		List<Employee> employeeList=new ArrayList<>();
 
		Employee e1=new Employee("John",21);
		Employee e2=new Employee("Martin",19);
		Employee e3=new Employee("Mary",31);
		Employee e4=new Employee("Stephan",18);
		Employee e5=new Employee("Gary",26);
		Employee e6=new Employee("John",11);
		Employee e7=new Employee("Martin",29);
		Employee e8=new Employee("Mary",31);
		Employee e9=new Employee("Mary",18);
		Employee e10=new Employee("John",26);
 
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		employeeList.add(e6);
		employeeList.add(e7);
		employeeList.add(e8);
		employeeList.add(e9);
		employeeList.add(e10);
		
 
		return employeeList;
	}
}
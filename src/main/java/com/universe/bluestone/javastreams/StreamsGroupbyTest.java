package com.universe.bluestone.javastreams;
 
import com.universe.bluestone.dto.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
 
public class StreamsGroupbyTest {
	public static void main(String args[])
	{
		List<Employee> employeeList = createEmployeeList();
		Map<String, List<Employee>> map = employeeList.stream()
				                              .collect(Collectors.groupingBy(Employee::getName));
		map.forEach((name,employeeListTemp)->System.out.println("Name: "+name+" ==>"+employeeListTemp));
	}
	
	public static List<Employee> createEmployeeList()
	{
		List<Employee> employeeList=new ArrayList<>();
 
		Employee e1=new Employee("John",21);
		Employee e2=new Employee("Martin",19);
		Employee e3=new Employee("Mary",31);
		Employee e4=new Employee("Mary",18);
		Employee e5=new Employee("John",26);
 
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
 
		return employeeList;
	}
}
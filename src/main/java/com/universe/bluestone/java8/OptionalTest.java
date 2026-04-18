package com.universe.bluestone.java8;
 
import com.universe.bluestone.dto.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
 
public class OptionalTest {
	
	public static void main(String[] args)
	{
		List<Employee> employeeList = createEmployeeList();
		Optional<Employee> employeeOpt = findEmployee(employeeList,"Adam");
		if(employeeOpt.isPresent())
		{
			Employee employee = employeeOpt.get();
			System.out.println("Employee name: "+employee.getName());
		}
		else
		{
			System.out.println("There is no employee with name Adam");
		}
		
		Optional<Employee> employeeOpt1 = findEmployee(employeeList,"Adam");
		Optional<Employee> employeeOpt2 = findEmployee(employeeList,"John");
		
		employeeOpt1.ifPresent((employee)->System.out.println("Employee name: "+employee.getName()+" found in list"));
		employeeOpt2.ifPresent((employee)->System.out.println("Employee name: "+employee.getName()+" found in list"));
		
		Optional<Employee> employeeOpt11 = findEmployee(employeeList,"Adam");
		Employee employee1 = employeeOpt11.orElse(new Employee("Dummy",0));
		System.out.println("Employee name: "+employee1.getName());
		
		Optional<Employee> employeeOpt22 = findEmployee(employeeList,"Martin");
		Employee employee2= employeeOpt22.orElse(new Employee("Dummy",0));
		System.out.println("Employee name: "+employee2.getName());
		
		Optional<Employee> employeeOpt111 = findEmployee(employeeList,"Adam");
		Employee employee111 = employeeOpt111.orElseThrow(() -> new RuntimeException("Employee not found"));
		System.out.println("Employee name: "+employee1.getName());
		
		Optional<Employee> employeeOpt222 = findEmployee(employeeList,"Martin");
		Employee employee222 = employeeOpt222.orElseThrow(() -> new RuntimeException("Employee not found"));
		System.out.println("Employee name: "+employee2.getName());
 
	}
	
	public static Optional<Employee> findEmployee(List<Employee> employeeList,String name)
	{
		for(Employee e:employeeList)
		{
			if(e.getName().equalsIgnoreCase(name))
			{
				return Optional.of(e);
			}
		}
		return Optional.empty();
	}
	public static List<Employee> createEmployeeList()
	{
		List<Employee> employeeList=new ArrayList<>();
		
		Employee e1=new Employee("John",21);
		Employee e2=new Employee("Martin",22);
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
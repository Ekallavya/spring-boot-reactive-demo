package com.universe.bluestone.javastreams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
class Employee {
    String name;
    String department;
    String gender;
    // Constructor, getters, and toString omitted for brevity
}

public class StreamMultiLevelGrouping {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "Engineering", "Female"),
            new Employee("Bob", "Engineering", "Male"),
            new Employee("Charlie", "HR", "Male"),
            new Employee("Diana", "Engineering", "Female")
        );

        // single-level grouping: Department -> List of Employees
        Map<String, List<Employee>> empGroupByMap = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(empGroupByMap);

        // Multi-level grouping: Department -> Gender -> List of Employees
        Map<String, Map<String, List<Employee>>> empMultiGroupMap = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment, // First level
                        Collectors.groupingBy(Employee::getGender) // Second level
                ));

        System.out.println(empMultiGroupMap);

        //
        Map<String, Set<String>> empGroupByMapping = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment, // First level
                        Collectors.mapping(Employee::getName,Collectors.toSet()) // Second level
                ));

        System.out.println(empGroupByMapping);

    }
}
//output
//{Engineering=[Employee(name=Alice, department=Engineering, gender=Female), Employee(name=Bob, department=Engineering, gender=Male), Employee(name=Diana, department=Engineering, gender=Female)], HR=[Employee(name=Charlie, department=HR, gender=Male)]}
//{Engineering={Male=[Employee(name=Bob, department=Engineering, gender=Male)], Female=[Employee(name=Alice, department=Engineering, gender=Female), Employee(name=Diana, department=Engineering, gender=Female)]}, HR={Male=[Employee(name=Charlie, department=HR, gender=Male)]}}
//{Engineering=[Diana, Bob, Alice], HR=[Charlie]}

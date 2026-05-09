package com.universe.bluestone.javastreams.collectors;

import com.universe.bluestone.dto.Payroll;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsComparingMinByMaxBy
{
    // Program to demonstrate `Collectors.minBy()` and `Collectors.maxBy()`
    // methods in Java 8 and above
    public static void main(String[] args)
    {
        Payroll p1 = new Payroll("Employee1", 115000);
        Payroll p2 = new Payroll("Employee2", 100000);
        Payroll p3 = new Payroll("Employee3", 120000);
 
        List<Payroll> salaries = Arrays.asList(p1, p2, p3);
 
        // get a person with the minimum income
        Comparator<Payroll> payrollComparator = Comparator.comparingInt(Payroll::getIncome);
        Payroll minIncome = salaries.stream()
                            .collect(Collectors.minBy(payrollComparator)).get();
        System.out.println("Employee with minimum Salary " + minIncome);
 
        // get a person with the maximum income
        Payroll maxIncome = salaries.stream()
                            .collect(Collectors.maxBy(
                                Comparator.comparingInt(Payroll::getIncome)))
                            .get();
        System.out.println("Employee with maximum Salary " + maxIncome);
        
        Payroll maxName = salaries.stream()
                .collect(Collectors.maxBy(
                    Comparator.comparing(Payroll::getEmployee)))
                .get();

        salaries.stream()
                .max(Comparator.comparing(Payroll::getEmployee))
                .get();
        
        System.out.println("Employee with maximum name : " + maxName.getEmployee());
    }
}
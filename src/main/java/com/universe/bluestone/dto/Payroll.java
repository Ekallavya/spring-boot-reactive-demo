package com.universe.bluestone.dto;

// `Payroll` class having `employee` and `income` as private fields
public class Payroll {
    private String employee;
    private Integer income;

    public Payroll(String employee, Integer income) {
        this.employee = employee;
        this.income = income;
    }

    public Integer getIncome() {
        return income;
    }


    // other getters and setters

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "[" + employee + ", " + String.valueOf(income) + "]";
    }

    public static Payroll max(Payroll x, Payroll y) {
        return x.getIncome() > y.getIncome() ? x : y;
    }
}

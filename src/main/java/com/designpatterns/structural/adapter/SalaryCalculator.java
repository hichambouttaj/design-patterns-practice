package com.designpatterns.structural.adapter;

public class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        return employee.getBasicSalary() * 1.5;
    }
}

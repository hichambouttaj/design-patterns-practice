package com.designpatterns.structural.adapter;

public class SalaryAdapter extends SalaryCalculator {
    public double calculateSalary(MachineOperator operator) {
        Employee employee = new Employee();
        employee.setBasicSalary(operator.getBasicSalary());
        return super.calculateSalary(employee);
    }
}

package com.designpatterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Hicham");
        employee.setBasicSalary(1000);

        MachineOperator operator = new MachineOperator();
        operator.setBasicSalary(100);

        SalaryAdapter calculator = new SalaryAdapter();
        double salaryEmployee = calculator.calculateSalary(employee);
        double salaryOperator = calculator.calculateSalary(operator);

        System.out.println("Employee salary : " + salaryEmployee);
        System.out.println("Operator salary : " + salaryOperator);
    }
}

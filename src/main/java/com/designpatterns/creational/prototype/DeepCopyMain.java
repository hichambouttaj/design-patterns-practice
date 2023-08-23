package com.designpatterns.creational.prototype;

public class DeepCopyMain {
    public static void main(String[] args) {
        EmployeePrototype tempEmp1 = new TempEmployee();
        tempEmp1.setName("temp employee 1");
        tempEmp1.setId(1);
        tempEmp1.setAddress(new Address("B1", "street name", "cty 1"));

        EmployeePrototype tempEmp2 = tempEmp1.deepCopy();

        System.out.println("=========== Temp Employee 1 Original Values ===========");
        System.out.println(tempEmp1.toString());

        System.out.println("=========== Temp Employee 2 Copy ===========");
        System.out.println(tempEmp2.toString());

        tempEmp2.getAddress().setCity("new city");

        System.out.println("=========== Temp Employee 1 After Change city value ===========");
        System.out.println(tempEmp1.toString());

        System.out.println("=========== Temp Employee 2 After Change city value ===========");
        System.out.println(tempEmp2.toString());
    }
}

package com.designpatterns.creational.prototype;

public class TempEmployee extends EmployeePrototype{
    @Override
    public EmployeePrototype shallowCopy() {
        return this.clone();
    }
    @Override
    public EmployeePrototype deepCopy() {
        TempEmployee employee = new TempEmployee();
        employee = (TempEmployee) this.clone();

        employee.setAddress(new Address(
                employee.getAddress().getBuilding(),
                employee.getAddress().getStreetName(),
                employee.getAddress().getCity()
        ));

        employee.setName(employee.getName());

        return employee;
    }
    @Override
    public EmployeePrototype clone() {
        return super.clone();
    }
}

package com.designpatterns.creational.prototype;

public abstract class EmployeePrototype implements Cloneable{
    private int id;
    private String name;
    private Address address;
    public abstract EmployeePrototype shallowCopy();
    public abstract EmployeePrototype deepCopy();
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return String.format("Employee:\n id: %d\n Name: %s\n Address: %s, %s, %s", id, name, address.getCity(), address.getStreetName(), address.getBuilding());
    }
    @Override
    public EmployeePrototype clone() {
        try {
            return (EmployeePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

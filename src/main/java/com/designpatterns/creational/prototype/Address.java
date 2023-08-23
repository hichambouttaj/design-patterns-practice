package com.designpatterns.creational.prototype;

public class Address {
    private String building;
    private String streetName;
    private String city;
    public Address() {
    }
    public Address(String building, String streetName, String city) {
        this.building = building;
        this.streetName = streetName;
        this.city = city;
    }
    public String getBuilding() {
        return building;
    }
    public void setBuilding(String building) {
        this.building = building;
    }
    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}

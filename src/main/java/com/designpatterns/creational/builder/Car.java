package com.designpatterns.creational.builder;

public class Car implements Builder{
    private final String brand;
    private final Product product;
    public Car(String brand) {
        product = new Product();
        this.brand = brand;
    }
    @Override
    public void startUpOperation() {
        product.add(String.format("Car Model name : %s", this.brand));
    }
    @Override
    public void buildBody() {
        product.add("Body of car was added");
    }
    @Override
    public void insertWheels() {
        product.add("Wheels are added");
    }
    @Override
    public void addHeadLights() {
        product.add("Headlights are added");
    }
    @Override
    public void endOperations() {
        /* End Operations */
    }
    @Override
    public Product getVehicle() {
        return this.product;
    }
}

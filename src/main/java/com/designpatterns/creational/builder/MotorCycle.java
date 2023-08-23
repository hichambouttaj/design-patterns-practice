package com.designpatterns.creational.builder;

public class MotorCycle implements Builder{
    private final String brand;
    private final Product product;
    public MotorCycle(String brand) {
        this.product = new Product();
        this.brand = brand;
    }

    @Override
    public void startUpOperation() {
        /* Start Operations */
    }

    @Override
    public void buildBody() {
        product.add("Body of motor cycle was added");
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
        product.add(String.format("Motor Cycle Model name : %s", this.brand));
    }

    @Override
    public Product getVehicle() {
        return this.product;
    }
}

package com.designpatterns.creational.builder;

public class Director {
    public void construct(Builder builder) {
        builder.startUpOperation();
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadLights();
        builder.endOperations();
    }
}

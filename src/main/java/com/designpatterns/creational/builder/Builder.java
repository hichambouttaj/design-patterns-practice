package com.designpatterns.creational.builder;

public interface Builder {
    void startUpOperation();
    void buildBody();
    void insertWheels();
    void addHeadLights();
    void endOperations();
    Product getVehicle();
}

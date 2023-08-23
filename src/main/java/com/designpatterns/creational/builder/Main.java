package com.designpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Builder carBuilder = new Car("Jeep");
        Builder motorCycleBuilder = new MotorCycle("Honda");

        // making car
        director.construct(carBuilder);
        Product car = carBuilder.getVehicle();
        System.out.printf("Car %s", car.show());

        System.out.println("=============================");

        // making motor cycle
        director.construct(motorCycleBuilder);
        Product motorCycle = motorCycleBuilder.getVehicle();
        System.out.printf("MotorCycle %s", motorCycle.show());
    }
}

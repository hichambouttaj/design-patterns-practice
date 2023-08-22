package com.designpatterns.creational.singleton;


public class Main {
    public static void main(String[] args) {
        Counter counter1 = Counter.getInstance();
        Counter counter2 = Counter.getInstance();

        counter1.addOne();
        counter2.addOne();

        System.out.println("Counter 1: " + counter1.count);
        System.out.println("Counter 2: " + counter2.count);

        counter1.addOne();

        System.out.println("Counter 1: " + counter1.count);
        System.out.println("Counter 2: " + counter2.count);
    }
}

package com.designpatterns.creational.singleton.without;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        counter1.addOne();
        counter2.addOne();

        System.out.println("Counter 1: " + counter1.count);
        System.out.println("Counter 2: " + counter2.count);

        counter1.addOne();

        System.out.println("Counter 1: " + counter1.count);
        System.out.println("Counter 2: " + counter2.count);
    }
}

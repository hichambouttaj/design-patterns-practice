package com.designpatterns.creational.singleton;

public class Counter {
    public int count = 0;
    private static final Counter instance = new Counter();
    private Counter() {
    }
    public static Counter getInstance() {
        return instance;
    }
    public void addOne() {
        this.count++;
    }
}

package com.designpatterns.creational.singleton.threadsafety;

public class Counter {
    public int count = 0;
    private static Counter instance = null;
    private static final Object lockObject = new Object();
    private Counter() {
    }
    public static Counter getInstance() {
        if(instance == null) {
            synchronized (lockObject) {
                if(instance == null) {
                    instance = new Counter();
                }
            }
        }
        return instance;
    }
    public void addOne() {
        this.count++;
    }
}
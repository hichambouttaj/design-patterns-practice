package com.designpatterns.creational.singleton.threadsafety;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // run 2 task in the same time
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // task 1
        Runnable task1 = () -> {
            Counter counter1 = Counter.getInstance();
            counter1.addOne();
            System.out.println("Counter 1: " + counter1.count + " - thread: " + Thread.currentThread().getId());
        };

        // task 2
        Runnable task2 = () -> {
            Counter counter2 = Counter.getInstance();
            counter2.addOne();
            System.out.println("Counter 2: " + counter2.count + " - thread: " + Thread.currentThread().getId());
        };

        executorService.submit(task1);
        executorService.submit(task2);

        executorService.shutdown();
    }
}

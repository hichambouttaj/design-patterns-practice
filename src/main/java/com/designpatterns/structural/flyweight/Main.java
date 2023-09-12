package com.designpatterns.structural.flyweight;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        DiscountCalcFactory discountCalcFactory = new DiscountCalcFactory();
        DiscountCalculator calculator = discountCalcFactory.getDiscountCalc("item");

        double value = calculator.getDiscountValue(LocalDateTime.now(), null);

        System.out.println(value);
    }
}

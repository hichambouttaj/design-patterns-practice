package com.designpatterns.structural.flyweight;

import java.time.LocalDateTime;

public class DayDiscountCalc implements DiscountCalculator{
    @Override
    public double getDiscountValue(LocalDateTime currentDate, String itemId) {
        // call database to calculate today discount
        return 0.15;
    }
}

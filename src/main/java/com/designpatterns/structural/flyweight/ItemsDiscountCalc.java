package com.designpatterns.structural.flyweight;

import java.time.LocalDateTime;

public class ItemsDiscountCalc implements DiscountCalculator{
    @Override
    public double getDiscountValue(LocalDateTime currentDate, String itemId) {
        // call database to calculate item discount
        return 0.10;
    }
}

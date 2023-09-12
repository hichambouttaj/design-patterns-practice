package com.designpatterns.structural.flyweight;

import java.time.LocalDateTime;

public interface DiscountCalculator {
    double getDiscountValue(LocalDateTime currentDate, String itemId);
}

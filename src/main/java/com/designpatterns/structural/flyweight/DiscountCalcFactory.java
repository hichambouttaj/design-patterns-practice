package com.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DiscountCalcFactory {
    private final Map<String, DiscountCalculator> calculatorMap = new HashMap<>();

    public DiscountCalculator getDiscountCalc(String calcType) {
        DiscountCalculator calculator = null;

        if(calculatorMap.containsKey(calcType)) {
            return calculatorMap.get(calcType);
        }

        switch (calcType) {
            case "day" -> {
                calculator = new DayDiscountCalc();
                calculatorMap.put("day", calculator);
            }
            case "item" -> {
                calculator = new ItemsDiscountCalc();
                calculatorMap.put("item", calculator);
            }
        }

        return calculator;
    }
}

package com.designpatterns.structural.facade;

public class Inventory {
    public boolean checkItemQuantity(String itemId, double quantity) {
        // in real world application should check quantity in database
        return quantity < 100;
    }
}

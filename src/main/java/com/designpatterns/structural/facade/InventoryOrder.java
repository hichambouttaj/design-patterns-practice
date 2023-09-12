package com.designpatterns.structural.facade;

import java.util.List;
import java.util.UUID;

public class InventoryOrder {
    public String createOrder(ShoppingBasket basket) {
        List<BasketItem> items = basket.getItems();
        return String.format("Order Number is %s with %d items", UUID.randomUUID(), items.size());
    }
}

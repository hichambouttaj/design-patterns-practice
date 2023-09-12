package com.designpatterns.structural.facade;

import java.util.*;
public class ShoppingBasket {
    private final Map<String, BasketItem> basketItems = new HashMap<>();
    public void addItem(BasketItem item) {
        basketItems.put(item.getItemId(), item);
    }
    public void removeOneItem(String itemId) {
        BasketItem item = basketItems.get(itemId);

        if(item == null)
            return;

        if(item.getQuantity() > 0) {
            double quantity = item.getQuantity() - 1;
            item.setQuantity(quantity);
            basketItems.put(itemId, item);
        }
    }
    public  List<BasketItem> getItems() {
        return basketItems.values().stream().toList();
    }
}

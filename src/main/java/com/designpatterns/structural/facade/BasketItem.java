package com.designpatterns.structural.facade;

public class BasketItem {
    private String itemId;
    private double itemPrice;
    private double quantity;

    public BasketItem(String itemId, double itemPrice, double quantity) {
        this.itemId = itemId;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}

package com.designpatterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        ShoppingBasket basket = new ShoppingBasket();
        basket.addItem(new BasketItem("123", 50, 3));
        basket.addItem(new BasketItem("456", 40, 2));

        PurchaseOrder order = new PurchaseOrder();
        boolean isSuccessOrder = order.createOrder(basket, "name=hicham, bank=123456789, mobile=123456789");

        System.out.println(isSuccessOrder ? "Order created with success" : "Error on creating order");
    }
}

package com.designpatterns.structural.facade;

import java.util.List;

public class PurchaseInvoice {
    private double discount = 0;
    private double totalAmount = 0;
    private double netTotal = 0;
    public PurchaseInvoice createInvoice(ShoppingBasket basket, String customerInfo) {
        PurchaseInvoice invoice = new PurchaseInvoice();
        List<BasketItem> items = basket.getItems();

        items.forEach(item -> invoice.setTotalAmount(item.getItemPrice() * item.getQuantity()));

        // apply discount
        if(items.size() > 5) {
            invoice.setDiscount(20);
        }

        invoice.setNetTotal(invoice.getTotalAmount() - invoice.getDiscount());

        return invoice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(double netTotal) {
        this.netTotal = netTotal;
    }
}

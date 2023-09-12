package com.designpatterns.structural.facade;

public class PurchaseOrder {
    public boolean createOrder(ShoppingBasket basket, String customerInfo) {
        // check stock
        boolean isAvailable = true;
        Inventory inventory = new Inventory();

        for(BasketItem item : basket.getItems()) {
            if(!inventory.checkItemQuantity(item.getItemId(), item.getQuantity())) {
                isAvailable = false;
            }
        }

        if(!isAvailable)
            return false;

        // create inventory order
        InventoryOrder inventoryOrder = new InventoryOrder();
        inventoryOrder.createOrder(basket);

        // create invoice
        PurchaseInvoice invoice = new PurchaseInvoice();
        invoice = invoice.createInvoice(basket, "address:123, id=456, email=test@gmail.com");

        // payment
        PaymentProcessor payment = new PaymentProcessor();
        payment.handlePayment(invoice.getNetTotal(), "account=123456789");

        // send sms
        SMSNotification smsNotification = new SMSNotification();
        smsNotification.sendSMS("123", "Invoice Created");

        return true;
    }
}

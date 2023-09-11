package com.designpatterns.creational.abstract_factory;

public interface BankFactory {
    Bank getBank(String bankCode);
    PaymentCard getPaymentCard(String cardNumber);
}

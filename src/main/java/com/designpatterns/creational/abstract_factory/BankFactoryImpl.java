package com.designpatterns.creational.abstract_factory;

public class BankFactoryImpl implements BankFactory {
    @Override
    public Bank getBank(String bankCode) {
        switch(bankCode) {
            case "123456" -> {
                return new BankA();
            }
            case "111111" -> {
                return new BankB();
            }
        }
        return null;
    }

    @Override
    public PaymentCard getPaymentCard(String cardNumber) {
        switch(cardNumber) {
            case "12" -> {
                return new VisaCard();
            }
            case "34" -> {
                return new MasterCard();
            }
        }
        return null;
    }
}

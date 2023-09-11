package com.designpatterns.creational.abstract_factory;

public class VisaCard implements PaymentCard {
    @Override
    public String getName() {
        return "Visa Card";
    }
    @Override
    public String getProviderInfo() {
        return "Visa";
    }
}

package com.designpatterns.creational.abstract_factory;

public class MasterCard implements PaymentCard {
    @Override
    public String getName() {
        return "Master Card";
    }
    @Override
    public String getProviderInfo() {
        return "MasterCard";
    }
}

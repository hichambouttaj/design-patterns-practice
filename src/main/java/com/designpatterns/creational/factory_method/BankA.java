package com.designpatterns.creational.factory_method;

public class BankA implements Bank {
    @Override
    public String withDraw() {
        return "You request is handling by Bank A";
    }
}

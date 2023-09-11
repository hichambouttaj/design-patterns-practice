package com.designpatterns.creational.abstract_factory;

public class BankA implements Bank {
    @Override
    public String withDraw() {
        return "You request is handling by Bank A";
    }
}

package com.designpatterns.creational.factory_method;

public class BankB implements Bank {
    @Override
    public String withDraw() {
        return "You request is handling by Bank B";
    }
}

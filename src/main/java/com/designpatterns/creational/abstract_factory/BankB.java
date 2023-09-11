package com.designpatterns.creational.abstract_factory;

public class BankB implements Bank {
    @Override
    public String withDraw() {
        return "You request is handling by Bank B";
    }
}

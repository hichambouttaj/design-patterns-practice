package com.designpatterns.creational.factory_method;

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
}

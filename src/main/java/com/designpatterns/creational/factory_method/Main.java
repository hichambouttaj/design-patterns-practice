package com.designpatterns.creational.factory_method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cardNumber;
        String bankCode;

        System.out.println("Enter your card number: ");
        cardNumber = scanner.nextLine();
        bankCode = cardNumber.substring(0, 6);

        BankFactory bankFactory = new BankFactoryImpl();

        Bank bank = bankFactory.getBank(bankCode);

        System.out.println(bank.withDraw());
    }
}

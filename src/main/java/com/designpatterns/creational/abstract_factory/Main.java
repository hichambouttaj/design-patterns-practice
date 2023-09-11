package com.designpatterns.creational.abstract_factory;

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
        PaymentCard paymentCard = bankFactory.getPaymentCard("12");

        System.out.println(bank.withDraw());
        System.out.println(paymentCard.getName());
    }
}

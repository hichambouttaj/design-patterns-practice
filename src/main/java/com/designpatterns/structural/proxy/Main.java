package com.designpatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        SMSServiceProxy proxy = new SMSServiceProxy();

        System.out.println(
                proxy.sendSMS("123", "1111111", "message 1")
        );
        System.out.println(
                proxy.sendSMS("123", "1111111", "message 2")
        );
        System.out.println(
                proxy.sendSMS("123", "1111111", "message 3")
        );
        System.out.println(
                proxy.sendSMS("123", "1111111", "message 4")
        );
        System.out.println(
                proxy.sendSMS("123", "1111111", "message 5")
        );

    }
}

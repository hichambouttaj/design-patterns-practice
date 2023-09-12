package com.designpatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        SMSService concretSMSService = new ConcreteSMSService();
        NotificationEmailDecorator emailDecorator = new NotificationEmailDecorator();

        emailDecorator.setService(concretSMSService);
        System.out.println(emailDecorator.sendSMS("123", "1111111", "message 1"));
    }
}

package com.designpatterns.structural.decorator;

public abstract class SMSService {
    public abstract String sendSMS(String customerId, String mobile, String sms);
}

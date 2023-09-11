package com.designpatterns.structural.proxy;

public abstract class SMSService {
    public abstract String sendSMS(String customerId, String mobile, String sms);
}

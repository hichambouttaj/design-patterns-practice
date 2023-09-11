package com.designpatterns.structural.proxy;

public class ConcreteSMSService extends SMSService{
    @Override
    public String sendSMS(String customerId, String mobile, String sms) {
        return String.format("Customer with id %s, sent sms to %s", customerId, mobile);
    }
}

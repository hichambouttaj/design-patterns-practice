package com.designpatterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class SMSServiceProxy {
    // count calls for each customer, if calls > MAX_SMS don't send sms
    private final int MAX_SMS = 3;
    private SMSService smsService;
    private final Map<String, Integer> sendCount = new HashMap<>();

    public String sendSMS(String customerId, String mobile, String sms) {
        if(smsService == null) {
            smsService = new ConcreteSMSService();
        }

        // first call for customer
        if(!sendCount.containsKey(customerId)) {
            sendCount.put(customerId, 1);
            return smsService.sendSMS(customerId, mobile, sms);
        }

        // check if calls > MAX_SMS
        var customer = sendCount.get(customerId);
        if(customer > MAX_SMS) {
            return "Not send";
        }

        sendCount.put(customerId, customer + 1);

        return smsService.sendSMS(customerId, mobile, sms);
    }
}

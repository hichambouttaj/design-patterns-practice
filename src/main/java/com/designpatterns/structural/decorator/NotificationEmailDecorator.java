package com.designpatterns.structural.decorator;

import java.time.LocalDateTime;

public class NotificationEmailDecorator extends AbstractDecorator{
    public String smsSentNotification(String customerId, String sms) {
        return String.format("sms %s, sent to %s, at %s", sms, customerId, LocalDateTime.now());
    }
    @Override
    public String sendSMS(String customerId, String mobile, String sms) {
        return super.sendSMS(customerId, mobile, sms) + "\n" +
                // decorator method to send notification
                smsSentNotification(customerId, sms);
    }
}

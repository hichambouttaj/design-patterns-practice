package com.designpatterns.structural.decorator;

public abstract class AbstractDecorator extends SMSService{
    protected SMSService notificationService;
    public void setService(SMSService service) {
        notificationService = service;
    }
    @Override
    public String sendSMS(String customerId, String mobile, String sms) {
        if(notificationService != null) {
            return notificationService.sendSMS(customerId, mobile, sms);
        }
        return "Notification service not initialized!";
    }
}

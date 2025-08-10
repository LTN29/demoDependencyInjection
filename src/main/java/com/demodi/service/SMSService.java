package com.demodi.service;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS sent with message: " + message);
    }
}

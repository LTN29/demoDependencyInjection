package com.demodi.app;

import com.demodi.service.MessageService;

public class Nofication {
    private final MessageService messageService;

    public Nofication(MessageService messageService) {
        this.messageService = messageService;

    }
    public void send(String message) {
        messageService.sendMessage(message);
    }
}

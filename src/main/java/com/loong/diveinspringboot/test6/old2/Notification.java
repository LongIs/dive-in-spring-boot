package com.loong.diveinspringboot.test6.old2;

public class Notification {


    private MessageSender messageSender;


    public Notification() {
        messageSender = new MessageSender();
    }

    public void sendMessage(String cellphone, String message) {
        this.messageSender.send(cellphone, message);
    }

}

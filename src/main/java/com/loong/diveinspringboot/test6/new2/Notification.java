package com.loong.diveinspringboot.test6.new2;

import com.loong.diveinspringboot.test6.old2.MessageSender;

public class Notification {

    private MessageSender messageSender;

    public Notification(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void send(String cellphone, String message) {
        messageSender.send(cellphone, message);
    }


}

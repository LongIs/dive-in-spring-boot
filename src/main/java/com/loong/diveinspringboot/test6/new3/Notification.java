package com.loong.diveinspringboot.test6.new3;

public class Notification {

    private MessageSender messageSender;

    public Notification(MessageSender sender) {
        this.messageSender = sender;
    }

    public void send(String phone, String content) {
        this.messageSender.send(phone, content);
    }


    public static void main(String[] args) {

        MessageSender sender = new SmsMessageSender();

        Notification notification = new Notification(sender);
    }

}

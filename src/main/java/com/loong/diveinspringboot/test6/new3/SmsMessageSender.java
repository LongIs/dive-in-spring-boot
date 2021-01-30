package com.loong.diveinspringboot.test6.new3;

public class SmsMessageSender implements MessageSender{
    @Override
    public void send(String phone, String content) {
        System.out.println("44444444");
    }
}

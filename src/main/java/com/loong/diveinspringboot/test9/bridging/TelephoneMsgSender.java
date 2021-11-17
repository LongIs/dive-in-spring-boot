package com.loong.diveinspringboot.test9.bridging;

public class TelephoneMsgSender implements MsgSender{
    @Override
    public void send(String message) {
        System.out.println(message);
    }
}

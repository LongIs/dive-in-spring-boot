package com.loong.diveinspringboot.test9.bridging;

public class TrivialNotification extends Notification{

    public TrivialNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}

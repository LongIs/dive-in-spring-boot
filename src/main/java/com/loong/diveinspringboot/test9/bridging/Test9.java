package com.loong.diveinspringboot.test9.bridging;

public class Test9 {

    public static void main(String[] args) {

        TrivialNotification telephoneMsgSender = new TrivialNotification(new TelephoneMsgSender());
        telephoneMsgSender.notify("12312");
    }

}

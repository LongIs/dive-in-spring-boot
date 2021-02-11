package com.loong.diveinspringboot.test7.new2;

import com.loong.diveinspringboot.test7.new1.EmailSender;
import com.loong.diveinspringboot.test7.new1.RequestStat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmailViewer implements StatViewer{

    private EmailSender emailSender;

    private List<String> toAddresses = new ArrayList<>();

    public EmailViewer() {

    }

    public EmailViewer(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void addToAddress(String address) {
        toAddresses.add(address);
    }


    @Override
    public void output(Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMills) {

    }
}

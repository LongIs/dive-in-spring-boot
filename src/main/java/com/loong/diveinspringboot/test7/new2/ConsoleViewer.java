package com.loong.diveinspringboot.test7.new2;

import com.google.gson.Gson;
import com.loong.diveinspringboot.test7.new1.RequestStat;

import java.util.Map;

public class ConsoleViewer implements StatViewer{
    @Override
    public void output(Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMills) {
        System.out.println("Time Span: [" + startTimeInMillis + ", " + endTimeInMills + "]");
        Gson gson = new Gson();
        System.out.println(gson.toJson(requestStats));
    }
}

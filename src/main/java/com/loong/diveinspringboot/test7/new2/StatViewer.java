package com.loong.diveinspringboot.test7.new2;

import com.loong.diveinspringboot.test7.new1.RequestStat;

import java.util.Map;

public interface StatViewer {
    void output(Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMills);
}

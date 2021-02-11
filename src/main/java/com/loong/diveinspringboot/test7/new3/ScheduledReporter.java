package com.loong.diveinspringboot.test7.new3;

import com.loong.diveinspringboot.test7.new1.RequestInfo;
import com.loong.diveinspringboot.test7.new1.RequestStat;
import com.loong.diveinspringboot.test7.new2.Aggregator;
import com.loong.diveinspringboot.test7.new1.MetricsStorage;
import com.loong.diveinspringboot.test7.new2.StatViewer;

import java.util.List;
import java.util.Map;

public abstract class ScheduledReporter {

    protected MetricsStorage metricsStorage;

    protected Aggregator aggregator;

    protected StatViewer viewer;

    public ScheduledReporter(MetricsStorage metricsStorage, Aggregator aggregator, StatViewer viewer) {
        this.metricsStorage = metricsStorage;
        this.aggregator = aggregator;
        this.viewer = viewer;
    }

    protected void doStatAndReport(long startTimeInMillis, long endTimeInMillis) {
        long durationInMillis = endTimeInMillis - startTimeInMillis;
        Map<String, List<RequestInfo>> requestInfos = metricsStorage.getRequestInfos(startTimeInMillis, endTimeInMillis);
        Map<String, RequestStat> requestStats = aggregator.aggregate(requestInfos, durationInMillis);
        viewer.output(requestStats, startTimeInMillis, endTimeInMillis);
    }
}

package com.loong.diveinspringboot.test7.new3;

import com.loong.diveinspringboot.test7.new1.MetricsStorage;
import com.loong.diveinspringboot.test7.new1.RedisMetricsStorage;
import com.loong.diveinspringboot.test7.new2.Aggregator;
import com.loong.diveinspringboot.test7.new2.ConsoleViewer;
import com.loong.diveinspringboot.test7.new2.StatViewer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ConsoleReporter extends ScheduledReporter{

    private ScheduledExecutorService executor;

    public ConsoleReporter() {
        this(new RedisMetricsStorage(), new Aggregator(), new ConsoleViewer());
    }

    public ConsoleReporter(MetricsStorage metricsStorage, Aggregator aggregator, StatViewer viewer) {
        super(metricsStorage, aggregator, viewer);
        this.executor = Executors.newSingleThreadScheduledExecutor();
    }

    public void startRepeatedReport(int i, int x) {

    }
}

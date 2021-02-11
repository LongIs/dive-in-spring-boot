package com.loong.diveinspringboot.test7.new3;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.loong.diveinspringboot.test7.new1.MetricsStorage;
import com.loong.diveinspringboot.test7.new1.RedisMetricsStorage;
import com.loong.diveinspringboot.test7.new1.RequestInfo;
import org.springframework.util.StringUtils;

import java.util.concurrent.Executors;

public class MetricsCollector {

    private static final int DEFAULT_STORAGE_THREAD_POOL_SIZE = 20;

    private MetricsStorage metricsStorage;
    private EventBus eventBus;


    public MetricsCollector() {
        this(new RedisMetricsStorage());
    }

    public MetricsCollector(MetricsStorage metricsCollector) {
        this.metricsStorage = metricsCollector;
    }

    public MetricsCollector(MetricsStorage metricsStorage, int threadNumToSaveData) {
        this.metricsStorage = metricsStorage;
        this.eventBus = new AsyncEventBus(Executors.newFixedThreadPool(threadNumToSaveData));
        this.eventBus.register(new EventListener());
    }

    public void recordRequest(RequestInfo register) {
        if (register == null || StringUtils.isEmpty(register.getApiName())) {
            return;
        }
        eventBus.post(register);
    }

    public class EventListener {

        @Subscribe
        public void saveRequestInfo(RequestInfo requestInfo) {
            metricsStorage.saveRequestInfo(requestInfo);
        }
    }
}

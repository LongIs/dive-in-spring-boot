package com.loong.diveinspringboot.test7.newq;

import org.springframework.util.StringUtils;

import java.util.Objects;

public class MetricsCollector {

    private MetricsStorage metricsStorage;

    public MetricsCollector(MetricsStorage metricsStorage) {
        this.metricsStorage = metricsStorage;
    }

    public void recordRequest(RequestInfo requestInfo) {

        if (Objects.isNull(requestInfo) || StringUtils.isEmpty(requestInfo.getApiName())) {
            return;
        }

        metricsStorage.saveRequestInfo(requestInfo);

    }

}

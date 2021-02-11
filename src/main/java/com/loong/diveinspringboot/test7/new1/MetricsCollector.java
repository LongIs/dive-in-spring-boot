package com.loong.diveinspringboot.test7.new1;

import org.springframework.util.StringUtils;

import java.util.Objects;

/**
 * 负责打点采集原始数据，包括记录每次接口请求的响应时间和请求时间戳
 */
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

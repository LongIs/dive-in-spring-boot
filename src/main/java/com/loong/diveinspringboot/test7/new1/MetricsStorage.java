package com.loong.diveinspringboot.test7.new1;

import java.util.List;
import java.util.Map;

/**
 * 负责原始数据的存储和读取
 */
public interface MetricsStorage {
    void saveRequestInfo(RequestInfo requestInfo);

    List<RequestInfo> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis);

    Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis);
}

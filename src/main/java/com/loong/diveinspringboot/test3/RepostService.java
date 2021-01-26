package com.loong.diveinspringboot.test3;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class RepostService {

    @Autowired
    private List<OrderStatisticsConsumer> orderStatisticsConsumers;

    public void process() {

        // 获取当天的订单
        List<Order> list = fetchDailyOrders();;

        // 生成统计信息
        OrderStatistics statistics = generateOrderStatistics(list);


        for (OrderStatisticsConsumer consumer : orderStatisticsConsumers) {
            consumer.consumer(statistics);
        }

    }

    private OrderStatistics generateOrderStatistics(List<Order> list) {

        return null;
    }

    private List<Order> fetchDailyOrders() {

        return new ArrayList<>();
    }

}
class Order {

}
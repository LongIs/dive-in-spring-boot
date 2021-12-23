package com.loong.diveinspringboot.test10.srping.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class DemoPublisher {

    @Autowired
    private ApplicationContext applicationContext;

    public void publishEvent(DemoEvent event) {
        this.applicationContext.publishEvent(event);
    }
}

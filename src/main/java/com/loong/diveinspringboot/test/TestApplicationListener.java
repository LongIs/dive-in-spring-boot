package com.loong.diveinspringboot.test;

import com.loong.diveinspringboot.test1.TestApplicationEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class TestApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof TestApplicationEvent) {
            TestApplicationEvent testApplicationEvent = (TestApplicationEvent) event;
            System.out.println(testApplicationEvent.getName());
        }
    }
}

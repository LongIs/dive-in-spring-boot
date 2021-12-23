package com.loong.diveinspringboot.test10.srping.event;

import org.springframework.context.ApplicationListener;

public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String message = demoEvent.getMessage();
        System.out.println(message);
    }
}

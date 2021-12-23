package com.loong.diveinspringboot.test10.srping.event;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent {
    private String message;

    public DemoEvent(Object source, String message) {
        super(source);
    }

    public String getMessage() {
        return this.message;
    }
}

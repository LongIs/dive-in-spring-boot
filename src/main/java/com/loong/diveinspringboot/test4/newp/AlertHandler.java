package com.loong.diveinspringboot.test4.newp;

import com.loong.diveinspringboot.test4.old.AlertRule;
import com.loong.diveinspringboot.test4.old.Notification;

public abstract class AlertHandler {

    protected AlertRule rule;

    protected Notification notification;

    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);

}

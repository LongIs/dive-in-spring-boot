package com.loong.diveinspringboot.test4.newp;

import com.loong.diveinspringboot.test4.old.AlertRule;
import com.loong.diveinspringboot.test4.old.Notification;
import com.loong.diveinspringboot.test4.old.NotificationEmergencyLevel;

public class ErrorAlertHandler extends AlertHandler {
    public ErrorAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getErrorCount() > rule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}

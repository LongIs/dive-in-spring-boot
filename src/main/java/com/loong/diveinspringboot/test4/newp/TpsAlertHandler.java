package com.loong.diveinspringboot.test4.newp;

import com.loong.diveinspringboot.test4.old.AlertRule;
import com.loong.diveinspringboot.test4.old.Notification;
import com.loong.diveinspringboot.test4.old.NotificationEmergencyLevel;

public class TpsAlertHandler extends AlertHandler{

    public TpsAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }


    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long tps = apiStatInfo.getRequestCount()/ apiStatInfo.getDurationOfSeconds();
        if (tps > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
    }
}

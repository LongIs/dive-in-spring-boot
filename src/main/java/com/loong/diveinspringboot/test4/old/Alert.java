package com.loong.diveinspringboot.test4.old;

public class Alert {

    private AlertRule rule;

    private Notification notification;

    public void check(String api, long requestCount, long errorCount, long durationOfSeconds) {

        long tps = requestCount / durationOfSeconds;

        if (tps > rule.getMatchedRule(api).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");

        } if (errorCount > rule.getMatchedRule(api).getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }

    }

}

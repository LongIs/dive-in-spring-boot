package com.loong.diveinspringboot.test4.newp;

import com.loong.diveinspringboot.test4.old.AlertRule;
import com.loong.diveinspringboot.test4.old.Notification;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class ApplicationContext {

    @Autowired
    private AlertRule alertRule;

    @Autowired
    private Notification notification;

    @Autowired
    private Alert alert;

    public Alert getAlert() { return alert; }

    @PostConstruct
    public void initializeBeans() {

        alert.addAlerthandler(new TpsAlertHandler(alertRule, notification));
        alert.addAlerthandler(new ErrorAlertHandler(alertRule, notification));
        alert.check(new ApiStatInfo());
    }

    // 饿汉式单例
    private static final ApplicationContext instance = new ApplicationContext();

    public static ApplicationContext getInstance() {
        return instance;
    }

}

package com.loong.diveinspringboot.test4.newp;

import java.util.ArrayList;
import java.util.List;

public class Alert {

    private List<AlertHandler> alertHandlers = new ArrayList<>();

    public void addAlerthandler(AlertHandler handler) {
        alertHandlers.add(handler);
    }

    public void check(ApiStatInfo apiStatInfo) {
        alertHandlers.forEach(e -> e.check(apiStatInfo));
    }

}

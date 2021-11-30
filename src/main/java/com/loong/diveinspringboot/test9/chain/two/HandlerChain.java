package com.loong.diveinspringboot.test9.chain.two;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {

    private List<IHandler> handlerList = new ArrayList<>();

    public void addHandler(IHandler iHandler){
        this.handlerList.add(iHandler);
    }

    public void handler() {
        for (IHandler handler : handlerList) {
            boolean handler1 = handler.handler();
            if (handler1) {
                break;
            }
        }
    }
}

package com.loong.diveinspringboot.Chapter3.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;

/**
 * @author xiongtaolong
 * @date 2019-05-29 16:26
 */
public class AfterHelloWorldApplicationListener  implements ApplicationListener<ContextRefreshedEvent> , Ordered {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("AfterHelloWorld:"+contextRefreshedEvent.getApplicationContext().getId());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}

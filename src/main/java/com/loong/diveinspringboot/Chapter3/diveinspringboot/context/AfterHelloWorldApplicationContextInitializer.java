package com.loong.diveinspringboot.Chapter3.diveinspringboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * @author xiongtaolong
 * @date 2019-05-27 20:56
 */
public class AfterHelloWorldApplicationContextInitializer<C extends ConfigurableApplicationContext>
        implements ApplicationContextInitializer<C> , Ordered {
    @Override
    public void initialize(C application) {
        System.out.println("AfterConfigurableApplicationContext.id:"+application.getId());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}

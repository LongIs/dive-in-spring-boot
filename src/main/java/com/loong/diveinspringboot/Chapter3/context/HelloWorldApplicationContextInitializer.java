package com.loong.diveinspringboot.Chapter3.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @author xiongtaolong
 * @date 2019-05-27 20:53
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationContextInitializer<C extends ConfigurableApplicationContext>
        implements ApplicationContextInitializer<C> {
    @Override
    public void initialize(C applicationContexy) {
        System.out.println("ConfigurableApplicationContext.id:"+applicationContexy.getId());
    }
}

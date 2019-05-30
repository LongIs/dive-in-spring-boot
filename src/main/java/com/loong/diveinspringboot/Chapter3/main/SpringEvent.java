package com.loong.diveinspringboot.Chapter3.main;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xiongtaolong
 * @date 2019-05-30 11:45
 */
public class SpringEvent {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.addApplicationListener(event ->{
            System.out.println("监听到事件："+event);
        });

        context.refresh();

        //发送事件以及自定义事件
        context.publishEvent("HelloWorld 2018");
        context.publishEvent("HelloWorld 2019");
        context.publishEvent(new ApplicationEvent("龙一") {

        });

        context.close();
    }
}

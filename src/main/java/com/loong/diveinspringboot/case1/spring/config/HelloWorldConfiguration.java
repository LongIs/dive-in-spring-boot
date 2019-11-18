package com.loong.diveinspringboot.case1.spring.config;

import org.springframework.context.annotation.Configuration;

/**
 * @author xiongtaolong
 * @date 2019-11-16 11:48
 */
@Configuration
public class HelloWorldConfiguration {

    public HelloWorldConfiguration() {
        System.out.println("HelloWorldConfiguration初始化....");
    }

}

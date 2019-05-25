package com.loong.diveinspringboot.Chapter2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld(){ //方法名即Bean名
        return "hello world 2018";
    }

    // ....
}

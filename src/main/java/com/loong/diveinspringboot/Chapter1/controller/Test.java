package com.loong.diveinspringboot.Chapter1.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("spring.loong")
public class Test {

    private int age;


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

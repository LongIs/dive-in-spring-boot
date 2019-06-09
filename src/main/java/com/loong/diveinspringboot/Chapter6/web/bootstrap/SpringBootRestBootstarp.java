package com.loong.diveinspringboot.Chapter6.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.loong.diveinspringboot.Chapter6.web.controller"})
public class SpringBootRestBootstarp {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestBootstarp.class);
    }
}

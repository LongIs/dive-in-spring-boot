package com.loong.diveinspringboot.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication();
        ConfigurableApplicationContext run = springApplication.run(Main.class);
        Test2 bean = (Test2) run.getBean("test2");

    }
}

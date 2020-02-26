package com.loong.diveinspringboot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(TestImportSelector.class)
public class Main {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication();
        ConfigurableApplicationContext run = springApplication.run(Main.class);
        Test bean = run.getBean(Test.class);
        bean.hello();
    }
}

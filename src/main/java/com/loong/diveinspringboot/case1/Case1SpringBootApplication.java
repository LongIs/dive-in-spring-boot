package com.loong.diveinspringboot.case1;

import com.loong.diveinspringboot.case1.spring.annotation.EnableHelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiongtaolong
 * @date 2019-11-16 11:13
 */
@SpringBootApplication
@EnableHelloWorld
public class Case1SpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(Case1SpringBootApplication.class, args);
    }
}

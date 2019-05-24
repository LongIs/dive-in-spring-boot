package com.loong.diveinspringboot.Chapter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.loong.diveinspringboot.Chapter1.web.servlet") //注册
public class DiveInSpringBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(DiveInSpringBootApplication.class, args);
	}
}


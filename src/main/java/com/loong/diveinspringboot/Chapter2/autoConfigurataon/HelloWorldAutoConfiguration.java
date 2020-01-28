package com.loong.diveinspringboot.Chapter2.autoConfigurataon;

import com.loong.diveinspringboot.Chapter2.annotation.EnableHelloWorld;
import com.loong.diveinspringboot.Chapter2.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableHelloWorld
@ConditionalOnSystemProperty(name = "user.name", value = "long")
@ComponentScan()
public class HelloWorldAutoConfiguration {
}

package com.loong.diveinspringboot.case1.spring.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author xiongtaolong
 * @date 2019-11-16 11:15
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(HelloWorldRegistrar.class)
public @interface EnableHelloWorld {
}

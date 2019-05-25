package com.loong.diveinspringboot.Chapter2.annotation;

import com.loong.diveinspringboot.Chapter2.configuration.HelloWorldConfiguration;
import com.loong.diveinspringboot.Chapter2.configuration.HelloWorldImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 激活HelloWorld模块
 * @Retention(RetentionPolicy.RUNTIME):策略运行时，可通过反射加载内容
 * @Target(ElementType.TYPE)：标注的位置，可标注在类上
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
//@Import(HelloWorldConfiguration.class)
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {
}

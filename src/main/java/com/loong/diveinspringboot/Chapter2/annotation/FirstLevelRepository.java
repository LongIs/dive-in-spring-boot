package com.loong.diveinspringboot.Chapter2.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * 派生性：当前注解标注了@Repository，而@Repository标注了@Component
 * 且注解属性一致（String value() default "";），则当前注解包含
 * @Repository及@Component的功能；
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirstLevelRepository {
    String value() default "";
}


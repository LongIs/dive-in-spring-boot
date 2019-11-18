package com.loong.diveinspringboot.case1.spring.config;

import com.loong.diveinspringboot.case1.condition.HelloWorldCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * @author xiongtaolong
 * @date 2019-11-16 16:15
 */
@Conditional(HelloWorldCondition.class)
@Component
public class HelloWorldConditionConfiguration {
    public HelloWorldConditionConfiguration (){
        System.out.println("HelloWorldConditionConfiguration初始化。。。");
    }
}

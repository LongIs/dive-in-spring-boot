package com.loong.diveinspringboot.case1.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author xiongtaolong
 * @date 2019-11-16 15:57
 */
public class HelloWorldCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // ...
        return true;
    }
}

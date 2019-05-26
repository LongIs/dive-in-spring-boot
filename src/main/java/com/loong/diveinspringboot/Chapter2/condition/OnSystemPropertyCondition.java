package com.loong.diveinspringboot.Chapter2.condition;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class OnSystemPropertyCondition implements Condition {
    /**
     * context、metadata具体解释：https://www.jianshu.com/p/0761ba179625
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 获取指定注解的元数据（注解中的属性）
        Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());
        String value = (String) attributes.get("value");
        return "long".equals(value);
    }
}

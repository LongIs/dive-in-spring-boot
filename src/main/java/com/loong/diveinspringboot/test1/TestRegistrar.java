package com.loong.diveinspringboot.test1;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class TestRegistrar implements ImportBeanDefinitionRegistrar {
    // 一般 AnnotationMetadata 逻辑判断，然后通过 BeanDefinitionRegistry 直接注册 Bean
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition(Test.class);
        beanDefinition.setSynthetic(true);
        beanDefinition.setLazyInit(true);
        //registry.registerBeanDefinition(Test.class.getName(), beanDefinition);
    }
}

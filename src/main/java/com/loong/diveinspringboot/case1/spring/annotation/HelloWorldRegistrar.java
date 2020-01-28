package com.loong.diveinspringboot.case1.spring.annotation;

import com.loong.diveinspringboot.case1.spring.config.HelloWorldConfiguration;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author xiongtaolong
 * @date 2019-11-16 11:16
 */
public class HelloWorldRegistrar implements ImportBeanDefinitionRegistrar {


    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        if (annotationMetadata.hasAnnotation
                ("com.loong.diveinspringboot.case1.spring.annotation.EnableHelloWorld")) {

            RootBeanDefinition beanDefinition = new RootBeanDefinition(HelloWorldConfiguration.class);
            beanDefinitionRegistry.registerBeanDefinition(HelloWorldConfiguration.class.getName(), beanDefinition);

        }
    }
}

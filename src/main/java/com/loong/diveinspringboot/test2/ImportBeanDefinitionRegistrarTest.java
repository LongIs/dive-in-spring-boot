package com.loong.diveinspringboot.test2;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class ImportBeanDefinitionRegistrarTest implements ImportBeanDefinitionRegistrar {


    public ImportBeanDefinitionRegistrarTest() {
        System.out.println(12312);
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        System.out.println(1231);
    }
}

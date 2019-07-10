package com.loong.diveinspringboot.Chapter7.spring.web.servlet;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@ComponentScan(basePackages = "com.loong.diveinspringboot.Chapter7.spring.web.servlet.controller")
@Configuration //加不加无所谓
public class DefautltAnnotationConfigDispatcherServletinitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{getClass()}; //返回当前类
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}

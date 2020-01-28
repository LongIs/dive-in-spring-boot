package com.loong.diveinspringboot.Chapter7.spring.web.servlet;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import java.util.Arrays;
import java.util.function.BiConsumer;

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

        addToLoaded(MutablePropertySources::addLast, false);

        return new String[0];
    }

    private void addToLoaded(BiConsumer<MutablePropertySources, PropertySource<?>> addMethod, boolean b) {

    }


    public static void main(String[] args) {
        //Arrays.asList(StringUtils.trimArrayElements(StringUtils.commaDelimitedListToStringArray((value != null) ? this.environment.resolvePlaceholders(value) : fallback)))
    }

}

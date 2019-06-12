package com.loong.diveinspringboot.Chapter4.servlet.support;

import com.loong.diveinspringboot.Chapter4.config.DispatcherServletConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author xiongtaolong
 * @date 2019-06-12 21:06
 */
public class DefaultAnnotationConfigDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() { //获取Spring应用容器的配置文件
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() { //负责获取Spring MVC应用容器
        return new Class[]{DispatcherServletConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() { //指定需要由DispatcherServlet映射的路径，这里给定的是"/"，意思是由DispatcherServlet处理所有向该应用发起的请求。
        return new String[]{"/"};
    }
}

package com.loong.diveinspringboot.Chapter2.configuration;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;


public class HelloWorldImportSelector implements ImportSelector {
    /**
     * 这种方法比较有弹性：
     *  可以调用importingClassMetadata里的方法来进行条件过滤
     *  具体那些方法参考：https://blog.csdn.net/f641385712/article/details/88765470
     * @param importingClassMetadata
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}

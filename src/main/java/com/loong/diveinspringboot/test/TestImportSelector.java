package com.loong.diveinspringboot.test;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class TestImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        if (importingClassMetadata.hasAnnotation("")) {
            // 判断是否包含某个注解
        }

        // 返回 Test 的全路径名，Test 会被放入到 Spring 容器中
        return new String[]{"com.loong.diveinspringboot.test.Test"};
    }
}

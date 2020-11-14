package com.loong.diveinspringboot.test2;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class ImportSelectorTest implements ImportSelector {

    public ImportSelectorTest(){
        System.out.println(12312);
    }

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println(12312);
        return new String[0];
    }
}

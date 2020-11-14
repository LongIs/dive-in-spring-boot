package com.loong.diveinspringboot.test2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import(ConfigurationTest.class)
public class ImportTest {

    public ImportTest(){
        System.out.println(1231);
    }

}

package com.loong.diveinspringboot.test2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.loong.diveinspringboot.test2")
public class CompoentSacnTest {

    public CompoentSacnTest(){
        System.out.println(1231);
    }

}

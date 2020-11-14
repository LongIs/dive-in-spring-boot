package com.loong.diveinspringboot.test2;

import org.springframework.stereotype.Component;

@Component
public class ComponentTest {
    public ComponentTest(){
        for(int i =1; i<100; i++) {
            System.out.println(12312);
        }
        System.out.println(123);
    }

}

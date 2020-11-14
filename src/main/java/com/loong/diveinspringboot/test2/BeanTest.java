package com.loong.diveinspringboot.test2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

public class BeanTest {

    public BeanTest(){
        System.out.println(123);
    }

    @Bean
    public BeanTest beanTest1() {
        return new BeanTest();
    }


    public static void main(String[] args) {
        String a = "123";
        String b = "123";
        System.out.println(a==b);


        String aa = new String("1");
        String bb = new String("1");
        System.out.println(aa == bb);

        new A();

    }

}


class A {

    public static List<String> list = new ArrayList(){{
        System.out.println(123122);
    }};


    static {
        System.out.println(12312312);
    }
}

/*



















 **/
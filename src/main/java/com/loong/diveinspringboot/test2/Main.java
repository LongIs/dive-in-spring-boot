package com.loong.diveinspringboot.test2;

import com.loong.diveinspringboot.test1.Test2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

@SpringBootApplication
public class Main {
    /*public static void main(String[] args) {
        SpringApplication.run(Main.class);


String i = new String("11");
String i1 = new String("11");
        System.out.println(i == i1);


        Integer ie = 1211;
        Integer iw = 1211;
        System.out.println(ie == iw);


        Integer ii1 = null;
        Integer ii2 = 1;

        System.out.println(Objects.equals(ii1, ii2));

    }*/

    public static String  a = "13";

    public static void main(String[] args) {
        Integer ii1 = null;
        Integer ii2 = null;



        System.out.println(Objects.equals(ii1, ii2));
    }

    public void et () {
        System.out.println(a);
    }
}

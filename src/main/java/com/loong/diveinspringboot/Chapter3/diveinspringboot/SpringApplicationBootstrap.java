package com.loong.diveinspringboot.Chapter3.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

public class SpringApplicationBootstrap {
    public static void main(String[] args) {
        /** run中丢进去的类只需要被@SpringBootApplication标注即可，不一定是当前类 */
        /*SpringApplication.run(ApplicationConfiguration.class,args);*/


        Set<String> set = new HashSet<>();
        set.add(ApplicationConfiguration.class.getName());
        SpringApplication application = new SpringApplication();
        /** 可存放类名称、包名称、XML路径3种，实现源的配置*/
        application.setSources(set);
        /** 关闭推断，注：Web容器启动后会进行阻塞，来接受请求，关闭之后就变成普通方式，启动后主线程就断掉， */
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @SpringBootApplication
    public static class ApplicationConfiguration{

    }
}



package com.loong.diveinspringboot.Chapter1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    Test test;

    public HelloWorldController () {
        System.out.println(test);
    }

    @GetMapping("/hello")
    public String helloWorld(@RequestParam String is){
        return is;

    }

}

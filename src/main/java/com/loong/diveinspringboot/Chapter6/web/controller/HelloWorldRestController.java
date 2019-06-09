package com.loong.diveinspringboot.Chapter6.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "HelloWorld";
    }

}

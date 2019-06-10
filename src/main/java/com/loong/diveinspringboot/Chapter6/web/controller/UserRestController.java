package com.loong.diveinspringboot.Chapter6.web.controller;

import com.loong.diveinspringboot.Chapter6.web.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @PostMapping("/echo/ser")
    public User user(@RequestBody User user){
        return user;
    }

}

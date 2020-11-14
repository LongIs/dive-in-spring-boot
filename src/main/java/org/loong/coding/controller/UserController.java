package org.loong.coding.controller;

import org.loong.coding.model.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author xiongtaolong
 * @date 2019-06-29 17:59
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String create(@Valid @RequestBody User user) {
        System.out.println(user.getUserName());
        return "success";
    }




    @PutMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String put(@ModelAttribute("user") User user,@PathVariable Long id) {
        System.out.println(user.getAge());
        return "success";
    }


    @GetMapping(value = "/operationCookie")
    public void displayHeaderInfo(@RequestHeader("Accept-Encoding") String encoding,
                                  @RequestHeader("Keep-Alive") long keepAlive)  {

        //…
    }

    @GetMapping(value = "/test1")
    public User test()  {
        User user = new User();
        user.setAge(11);
        user.setUserName("张三");
        return user;
    }
}

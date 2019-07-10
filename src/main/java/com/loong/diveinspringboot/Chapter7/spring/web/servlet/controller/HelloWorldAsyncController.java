package com.loong.diveinspringboot.Chapter7.spring.web.servlet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * 异步Controller
 */
@RestController
public class HelloWorldAsyncController {

    @GetMapping("/helloworld")
    public DeferredResult<String> helloworld(){
        DeferredResult<String> result = new DeferredResult<>();

        result.setResult("str");
        result.onCompletion(() ->{
            System.out.println("执行结束"); //是一个回调操作，当前方法执行完时，才执行
        }); //成功时返回 -- 会对系统IO有很大损伤

        //result.onError();   //错误时回调
        //result.onTimeout(); //超时时回调
        return result;
    }
}

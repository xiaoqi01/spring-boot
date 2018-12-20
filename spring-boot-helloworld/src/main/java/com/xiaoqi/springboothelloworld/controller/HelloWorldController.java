package com.xiaoqi.springboothelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoqi
 * 2018-12-20
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}

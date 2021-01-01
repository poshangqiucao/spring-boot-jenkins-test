package com.example.springbootjenkinstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Cheng Gang
 * @create_time: 2021/1/1 21:55
 * @update_time:
 * @description:
 * @version: 0.0.1
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "Hello Jenkins";
    }
}

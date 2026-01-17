package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello world";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Springboot";
    }
}

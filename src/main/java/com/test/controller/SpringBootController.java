package com.test.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SpringBootController {

    @RequestMapping("/")
    public String index() {
        return "Welcome to Spring Boot!";
    }

}
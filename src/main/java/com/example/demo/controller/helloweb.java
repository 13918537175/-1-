package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloweb {
    @GetMapping("/")
    public String hi(){
        return "hello";
    }
}

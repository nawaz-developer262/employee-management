package com.example.demo_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/message")
public class MessageController {
    @GetMapping
    public String getMessage() {
        return "Hi there!";
    }
    @GetMapping("/message1")
    public String getMessage2() {
        return "Hello there!";
    }
    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }
}

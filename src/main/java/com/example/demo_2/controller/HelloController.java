package com.example.demo_2.comtroller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {
    @GetMapping
    public String getMessage() {
        return "Hello World";
    }
}

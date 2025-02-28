package com.example.hellomessagingapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    @GetMapping("/hello/query{name}")
    public String sayHelloWithQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}

}
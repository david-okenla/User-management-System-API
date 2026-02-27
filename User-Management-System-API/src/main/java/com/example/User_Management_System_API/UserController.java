package com.example.User_Management_System_API;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/index")
    public String index() {
        return "Hello, World";
    } 
}

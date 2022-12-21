package com.personal.testbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockController {
    @GetMapping("/test")
    public String testController(){
        return "Welcome to the test!";
    }
}

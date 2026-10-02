package com.raju;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot Web Application";
    }

    @GetMapping("/about")
    public String about() {
        return "This is an Education Website";
    }
}
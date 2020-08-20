package com.example.testdeployment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${name.email}")
    private String email;
    @GetMapping
    public String hello(){
        return "admin_9000000000000000000";
    }
}

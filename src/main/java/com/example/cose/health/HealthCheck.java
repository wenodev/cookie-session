package com.example.cose.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping
    public String checkHealth(){
        return "OK";
    }
}

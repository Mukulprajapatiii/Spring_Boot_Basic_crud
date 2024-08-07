package com.mukulprajapatiii.Journal_App.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/home")
    public String healthcheck(){
        return "HealthCheck";
    }
}

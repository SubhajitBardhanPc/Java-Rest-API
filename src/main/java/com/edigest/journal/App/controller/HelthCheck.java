package com.edigest.journal.App.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelthCheck {

    @GetMapping("/health-check")
    public String healthCheck(){
        return "ok";
    }
}

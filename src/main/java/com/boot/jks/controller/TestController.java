package com.boot.jks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test/")
public class TestController {

    @GetMapping("getinfo")
    public String GetInfo(){
        return "Hello Jenkins";
    }
}

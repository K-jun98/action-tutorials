package com.metacoding.v1.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloController {


    @GetMapping("/aws/v1")
    public String hello(){
        return "<h1>Success</h1>";
    }
}

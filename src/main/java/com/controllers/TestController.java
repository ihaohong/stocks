package com.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController("TestController")
public class TestController {
    @RequestMapping(value = "/test-junit", method = {GET})
    public String testJunit() {
        return "Hello World";
    }
}

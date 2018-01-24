package com.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController("TestController")
public class TestController {
    @RequestMapping(value = "/test-junit", method = {GET})
    public String testJunit() {
        return "Hello World";
    }

    @RequestMapping(value = "/test/2", method = {GET})
    public Map<String, Map<String, String>> test1() {
        Map<String, Map<String, String>> result = new HashMap<String, Map<String, String>>();

        Map<String, String> etf300 = new HashMap<String, String>();
        etf300.put("code", "000300");
        etf300.put("name", "沪深300");

        Map<String, String> etf500 = new HashMap<String, String>();
        etf500.put("code", "000500");
        etf500.put("name", "中证500");

        result.put("000300", etf300);
        result.put("000500", etf500);

        return result;
    }
}

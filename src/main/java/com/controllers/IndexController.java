package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("IndexController")
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "index/index";
    }
}

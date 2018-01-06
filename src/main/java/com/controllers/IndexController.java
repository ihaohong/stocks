package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("IndexController")
public class IndexController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("foo", "bar");

        return "index/index";
    }
}

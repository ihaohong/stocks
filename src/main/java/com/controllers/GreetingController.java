package com.controllers;

import com.City;
import com.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller("GreetingController")
public class GreetingController {

    @Autowired
    private CityMapper cityMapper;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping("/city")
    public String city(@RequestParam(value="city", defaultValue="CA") String city, Model model) {
        City cityEntity = cityMapper.findByState(city);
        model.addAttribute("city", cityEntity);

        return "city";
    }

}
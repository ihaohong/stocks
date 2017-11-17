package com.controllers;

import com.mappers.UserMapper;
import com.models.City;
import com.mappers.CityMapper;
import com.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller("GreetingController")
public class GreetingController {

    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private UserMapper userMapper;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);

        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");

        return "greeting";
    }

    @RequestMapping("/city")
    public String city(@RequestParam(value="city", defaultValue="CA") String city, Model model) {
        City cityEntity = cityMapper.findByState(city);
        model.addAttribute("city", cityEntity);

        return "city";
    }

    @RequestMapping("/user")
    public String user(@RequestParam(value="username") String username, Model model) {
        User user = userMapper.findByUsername(username);
        System.out.println(user);

        return "home";
    }

}
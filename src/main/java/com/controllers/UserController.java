package com.controllers;

import com.mappers.UserMapper;
import com.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import static org.springframework.web.bind.annotation.RequestMethod.*;


@Controller("UserController")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/register", method = {GET})
    public String registerUI() {
        return "user/register";
    }

    @RequestMapping(value = "/register", method = {POST})
    public String register() {
//        System.out.println("this is register post action");

        return "test";
    }
}
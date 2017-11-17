package com.controllers;

import com.forms.RegisterForm;
import com.mappers.UserMapper;
import com.models.User;
import com.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.Errors;
import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.*;


@Controller("UserController")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register", method = {GET})
    public String registerUI(Model model) {
        model.addAttribute("registerForm", new RegisterForm());
        return "user/register";
    }

    @RequestMapping(value = "/register", method = {POST})
    public String register(@Valid RegisterForm registerForm, Errors errors, Model model) {
        User user = userService.registerUser(registerForm.getUsername(), registerForm.getPassword());

        return "test";
    }
}
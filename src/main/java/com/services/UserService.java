package com.services;

import com.mappers.UserMapper;
import com.models.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;

public class UserService {
    @Autowired
    private UserMapper userMapper;

}

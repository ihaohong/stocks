package com.services;

import com.mappers.UserMapper;
import com.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collections;

public class UserService implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User loginUser = userMapper.findByUsername(username);

        if (loginUser == null) {
            throw new UsernameNotFoundException("user not found");
        }

        return new org.springframework.security.core.userdetails.User(
                loginUser.getUsername(),
                loginUser.getPassword(),
                Collections.singleton(new SimpleGrantedAuthority(loginUser.getRole()))
        );
    }

    public User registerUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setRole("ROLE_ADMIN");

        userMapper.insertUser(user);

        return user;
    }
}

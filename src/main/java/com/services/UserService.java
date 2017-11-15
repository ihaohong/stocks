package com.services;

import com.mappers.UserMapper;
import com.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

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
}

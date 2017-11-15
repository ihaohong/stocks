package com.services;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import java.util.Collections;

public class UserService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String password = "huaerjie001";

        password = new StandardPasswordEncoder().encode(password);

        String role = "ROLE_USER";

        return new User(
                username,
                password,
                Collections.singleton(new SimpleGrantedAuthority(role))
        );
    }
}

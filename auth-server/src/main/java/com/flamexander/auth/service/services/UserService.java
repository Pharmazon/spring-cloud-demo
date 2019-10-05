package com.flamexander.auth.service.services;


import com.flamexander.auth.service.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByUsername(String username);
}

package com.example.You.are.not.forgotten.services.impl;

import com.example.You.are.not.forgotten.entities.User;
import com.example.You.are.not.forgotten.repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class YouAreNotForgottenDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public YouAreNotForgottenDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new  UsernameNotFoundException("User" + email + "not found"));

        return map(user);
    }

    private UserDetails map(User user){


        return  org.springframework.security.core.userdetails.User
                .withUsername(user.getEmail())
                .authorities("ROLE_" + user.getRole().name())
                .password(user.getPassword())
                .build();

    }
}

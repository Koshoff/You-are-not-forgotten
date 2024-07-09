package com.example.You.are.not.forgotten.services.impl;

import com.example.You.are.not.forgotten.entities.User;
import com.example.You.are.not.forgotten.entities.dto.UserRegistrationModel;
import com.example.You.are.not.forgotten.enums.Role;
import com.example.You.are.not.forgotten.repositories.UserRepository;
import com.example.You.are.not.forgotten.services.UserService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import util.SecurityUtils;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public void register(UserRegistrationModel userRegistrationModel) {
        User user = registrationModelToEntity(userRegistrationModel);
        userRepository.save(user);
    }

    @Override
    public boolean isEmailTaken(String email) {
        return userRepository.existsByEmail(email);
    }




    private User registrationModelToEntity(UserRegistrationModel userRegistrationModel) {
        User user = new User();
        user.setEmail(userRegistrationModel.getEmail());
        user.setPassword(passwordEncoder.encode((userRegistrationModel.getPassword())));
        user.setRole(Role.USER);
        return user;
    }
}

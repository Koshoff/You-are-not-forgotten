package com.example.You.are.not.forgotten.services;

import com.example.You.are.not.forgotten.entities.User;
import com.example.You.are.not.forgotten.entities.dto.UserRegistrationModel;


public interface UserService {

    void register(UserRegistrationModel userRegistrationModel);
    boolean isEmailTaken(String email);

}

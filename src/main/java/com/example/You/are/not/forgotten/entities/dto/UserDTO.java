package com.example.You.are.not.forgotten.entities.dto;

import com.example.You.are.not.forgotten.entities.User;
import com.example.You.are.not.forgotten.enums.Role;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class UserDTO {

    private Long id;
    private String email;
    private Role role;

    public UserDTO() {

    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

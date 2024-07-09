package com.example.You.are.not.forgotten.entities;

import com.example.You.are.not.forgotten.entities.base.entity.BaseEntity;
import com.example.You.are.not.forgotten.enums.Role;
import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User extends BaseEntity {


    @Column(nullable = false)
    private String password;
    @Column(unique = true, nullable = false)
    private String email;
    @Enumerated(EnumType.STRING)
    private Role role;


    public User() {
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

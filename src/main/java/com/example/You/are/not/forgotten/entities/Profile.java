package com.example.You.are.not.forgotten.entities;

import com.example.You.are.not.forgotten.entities.base.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "profiles")
public class Profile extends BaseEntity {
    @Column(nullable = false)
    @Size(min = 3)
    private String firstName;
    @Column(nullable = false)
    @Size(min = 3)
    private String lastName;
    @Column(nullable = false)
    @Size(min = 3)
    private String city;
    @Column(nullable = false)
    private Long yearsOfAge;
    @Column(nullable = false)
    @Size(min = 250)
    private String biography;
    private String photoUrl;


    public Profile() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getYearsOfAge() {
        return yearsOfAge;
    }

    public void setYearsOfAge(Long yearsOfAge) {
        this.yearsOfAge = yearsOfAge;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

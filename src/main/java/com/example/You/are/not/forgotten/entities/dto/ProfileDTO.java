package com.example.You.are.not.forgotten.entities.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Size;

public class ProfileDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private Long yearsOfAge;
    private String biography;
    private String photoUrl;

    public ProfileDTO() {

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

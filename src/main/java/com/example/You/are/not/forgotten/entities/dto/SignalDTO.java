package com.example.You.are.not.forgotten.entities.dto;

import java.util.List;

public class SignalDTO {

    private Long id;
    private String name;
    private int age;
    private String location;
    private String personInformation;
    private List<String> needs;
    private String contactInformation;

    public SignalDTO() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String getPersonInformation() {
        return personInformation;
    }

    public List<String> getNeeds() {
        return needs;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPersonInformation(String personInformation) {
        this.personInformation = personInformation;
    }

    public void setNeeds(List<String> needs) {
        this.needs = needs;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

package com.example.You.are.not.forgotten.entities;

import com.example.You.are.not.forgotten.entities.base.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.format.annotation.NumberFormat;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="signals")
public class Signal extends BaseEntity {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    @NumberFormat
    private int age;
    @Column(nullable = false)
    private String location;
    @Column(nullable = false)
    private String personInformation;
    @ElementCollection
    private List<String> needs;
    @Column(nullable = false)
    private String contactInformation;

    public Signal() {
        needs = new ArrayList<>();
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
}

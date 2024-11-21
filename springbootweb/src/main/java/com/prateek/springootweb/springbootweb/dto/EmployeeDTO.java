package com.prateek.springootweb.springbootweb.dto;

import java.time.LocalDate;

// This is the POJO (Plain Old Java Object) class where custom logic cannot be defined.
public class EmployeeDTO {
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private LocalDate dateOfJoining;
    private Boolean isActive;

    // Default constructor
    public EmployeeDTO() {
    }

    // Parameterized constructor to initialize all fields
    public EmployeeDTO(String name, Long id, String email, Integer age, LocalDate dateOfJoining, Boolean isActive) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
        this.isActive = isActive;
    }

    // Getter and setter methods for each field

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

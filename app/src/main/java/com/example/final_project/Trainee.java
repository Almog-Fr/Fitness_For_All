package com.example.final_project;

import java.util.UUID;

public class Trainee {
    private String firstName;
    private String lastName;
    private int age;
    public String id;
    private String email;
    private String password;
    private int level;
    private int experience;

    public Trainee(String firstName, String lastName, int age, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.password = password;
        this.level = 1;
        this.experience = 0;
        this.id = UUID.randomUUID().toString();
    }

    public Trainee(){

    }

    public int getExperience() {
        return experience;
    }

    public String getId() {
        return id;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getLevel() {
        return level;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

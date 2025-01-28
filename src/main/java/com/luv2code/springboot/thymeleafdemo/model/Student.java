package com.luv2code.springboot.thymeleafdemo.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private List<String> favoriteOperatingSystem;

    public Student() {
        this("", "", "");
    }

    public Student(String firstName, String lastName) {
        this(firstName, lastName, "");
    }

    public Student(String firstName, String lastName, String country) {
        this(firstName, lastName, country, "");
    }

    public Student(String firstName, String lastName, String country, String favoriteLanguage, String... favoriteOperatingSystem) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.favoriteLanguage = favoriteLanguage;
        this.favoriteOperatingSystem = new ArrayList<>(Arrays.asList(favoriteOperatingSystem));
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public List<String> getFavoriteOperatingSystem() {
        return favoriteOperatingSystem;
    }

    public void setFavoriteOperatingSystem(List<String> favoriteOperatingSystem) {
        this.favoriteOperatingSystem = favoriteOperatingSystem;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", favoriteLanguage='" + favoriteLanguage + '\'' +
                ", favoriteOperatingSystem=" + favoriteOperatingSystem +
                '}';
    }
}

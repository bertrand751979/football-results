package com.example.football_score.model;

import java.io.Serializable;

public class Group implements Serializable {
    private String NameOfGroup;
    private String countryOneName;
    private String countryTwoName;
    private String countryThreeName;
    private String countryFourName;

    public Group(String nameOfGroup, String countryOneName, String countryTwoName, String countryThreeName, String countryFourName) {
        NameOfGroup = nameOfGroup;
        this.countryOneName = countryOneName;
        this.countryTwoName = countryTwoName;
        this.countryThreeName = countryThreeName;
        this.countryFourName = countryFourName;
    }

    public Group(){}

    public String getNameOfGroup() {
        return NameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        NameOfGroup = nameOfGroup;
    }

    public String getCountryOneName() {
        return countryOneName;
    }

    public void setCountryOneName(String countryOneName) {
        this.countryOneName = countryOneName;
    }

    public String getCountryTwoName() {
        return countryTwoName;
    }

    public void setCountryTwoName(String countryTwoName) {
        this.countryTwoName = countryTwoName;
    }

    public String getCountryThreeName() {
        return countryThreeName;
    }

    public void setCountryThreeName(String countryThreeName) {
        this.countryThreeName = countryThreeName;
    }

    public String getCountryFourName() {
        return countryFourName;
    }

    public void setCountryFourName(String countryFourName) {
        this.countryFourName = countryFourName;
    }
}

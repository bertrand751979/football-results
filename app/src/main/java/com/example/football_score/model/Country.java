package com.example.football_score.model;

import java.io.Serializable;

public class Country implements Serializable {
    private String countryName;

    public Country(String countryName) {
        this.countryName = countryName;
    }
    public Country(){}

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }


    @Override
    public String toString() {
        return countryName;
    }
}

package com.example.football_score.model;

import java.io.Serializable;

public class Groupe implements Serializable {
    private String nameOfGroup;

    public Groupe(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public Groupe(){}

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }


    @Override
    public String toString() {
        return nameOfGroup;
    }
}

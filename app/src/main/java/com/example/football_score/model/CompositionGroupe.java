package com.example.football_score.model;

public class CompositionGroupe {

    private String groupeName;
    private String teamOne;
    private String teamTwo;
    private String teamThree;
    private String teamFour;

    public CompositionGroupe(String groupeName, String teamOne, String teamTwo, String teamThree, String teamFour) {
        this.groupeName = groupeName;
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.teamThree = teamThree;
        this.teamFour = teamFour;
    }
    public CompositionGroupe(){}

    public String getGroupeName() {
        return groupeName;
    }

    public void setGroupeName(String groupeName) {
        this.groupeName = groupeName;
    }

    public String getTeamOne() {
        return teamOne;
    }

    public void setTeamOne(String teamOne) {
        this.teamOne = teamOne;
    }

    public String getTeamTwo() {
        return teamTwo;
    }

    public void setTeamTwo(String teamTwo) {
        this.teamTwo = teamTwo;
    }

    public String getTeamThree() {
        return teamThree;
    }

    public void setTeamThree(String teamThree) {
        this.teamThree = teamThree;
    }

    public String getTeamFour() {
        return teamFour;
    }

    public void setTeamFour(String teamFour) {
        this.teamFour = teamFour;
    }
}

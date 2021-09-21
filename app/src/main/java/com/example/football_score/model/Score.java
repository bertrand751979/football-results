package com.example.football_score.model;

import java.io.Serializable;

public class Score implements Serializable {
    private String teamHome;
    private String teamAway;
    private String scoreTeamHome;
    private String scoreTeamAway;

    public Score(String teamHome, String teamAway, String scoreTeamHome, String scoreTeamAway) {
        this.teamHome = teamHome;
        this.teamAway = teamAway;
        this.scoreTeamHome = scoreTeamHome;
        this.scoreTeamAway = scoreTeamAway;
    }

    public Score(){}

    public String getTeamHome() {
        return teamHome;
    }

    public void setTeamHome(String teamHome) {
        this.teamHome = teamHome;
    }

    public String getTeamAway() {
        return teamAway;
    }

    public void setTeamAway(String teamAway) {
        this.teamAway = teamAway;
    }

    public String getScoreTeamHome() {
        return scoreTeamHome;
    }

    public void setScoreTeamHome(String scoreTeamHome) {
        this.scoreTeamHome = scoreTeamHome;
    }

    public String getScoreTeamAway() {
        return scoreTeamAway;
    }

    public void setScoreTeamAway(String scoreTeamAway) {
        this.scoreTeamAway = scoreTeamAway;
    }
}

package com.example.football_score.model;

import java.io.Serializable;

public class Score implements Serializable {
    private String teamHome;
    private String teamAway;
    private int scoreTeamHome;
    private int scoreTeamAway;

    public Score(String teamHome, String teamAway, int scoreTeamHome, int scoreTeamAway) {
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

    public int getScoreTeamHome() {
        return scoreTeamHome;
    }

    public void setScoreTeamHome(int scoreTeamHome) {
        this.scoreTeamHome = scoreTeamHome;
    }

    public int getScoreTeamAway() {
        return scoreTeamAway;
    }

    public void setScoreTeamAway(int scoreTeamAway) {
        this.scoreTeamAway = scoreTeamAway;
    }
}

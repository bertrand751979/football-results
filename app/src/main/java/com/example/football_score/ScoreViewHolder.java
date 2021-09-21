package com.example.football_score;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.football_score.model.Score;

public class ScoreViewHolder extends RecyclerView.ViewHolder {
    private TextView vhTeamHome;
    private TextView vhTeamAway;
    private TextView vhScoreTeamHome;
    private TextView vhScoreTeamAway;

    public ScoreViewHolder(@NonNull View view) {
        super(view);
        vhTeamHome=view.findViewById(R.id.rawDisplayTeamHome);
        vhTeamAway=view.findViewById(R.id.rawDisplayTeamAway);
        vhScoreTeamHome=view.findViewById(R.id.rawDisplayScoreHome);
        vhScoreTeamAway=view.findViewById(R.id.rawDisplayScoreAway);
    }

    public TextView getVhTeamHome() {
        return vhTeamHome;
    }

    public void setVhTeamHome(TextView vhTeamHome) {
        this.vhTeamHome = vhTeamHome;
    }

    public TextView getVhTeamAway() {
        return vhTeamAway;
    }

    public void setVhTeamAway(TextView vhTeamAway) {
        this.vhTeamAway = vhTeamAway;
    }

   public TextView getVhScoreTeamHome() {
        return vhScoreTeamHome;
    }

    public void setVhScoreTeamHome(TextView vhScoreTeamHome) {
        this.vhScoreTeamHome = vhScoreTeamHome;
    }

    public TextView getVhScoreTeamAway() {
        return vhScoreTeamAway;
    }

    public void setVhScoreTeamAway(TextView vhScoreTeamAway) {
        this.vhScoreTeamAway = vhScoreTeamAway;
    }

    public void bind(Score score){
        vhTeamHome.setText(score.getTeamHome());
        vhTeamAway.setText(score.getTeamAway());
        vhScoreTeamHome.setText(score.getScoreTeamHome());
        vhScoreTeamAway.setText(score.getScoreTeamAway());


    }
}

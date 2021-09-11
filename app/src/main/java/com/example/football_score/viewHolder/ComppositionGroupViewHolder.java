package com.example.football_score.viewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.football_score.R;
import com.example.football_score.model.CompositionGroupe;

public class ComppositionGroupViewHolder extends RecyclerView.ViewHolder {
    private TextView txtGroupName;
    private TextView txtTeam1;
    private TextView txtTeam2;
    private TextView txtTeam3;
    private TextView txtTeam4;

    public ComppositionGroupViewHolder(@NonNull View view) {
        super(view);
        txtGroupName=view.findViewById(R.id.raw_titleGroup);
        txtTeam1=view.findViewById(R.id.raw_countryOne);
        txtTeam2=view.findViewById(R.id.raw_countryTwo);
        txtTeam3=view.findViewById(R.id.raw_countryThree);
        txtTeam4=view.findViewById(R.id.raw_countryFour);
    }

    public TextView getTxtGroupName() {
        return txtGroupName;
    }

    public void setTxtGroupName(TextView txtGroupName) {
        this.txtGroupName = txtGroupName;
    }

    public TextView getTxtTeam1() {
        return txtTeam1;
    }

    public void setTxtTeam1(TextView txtTeam1) {
        this.txtTeam1 = txtTeam1;
    }

    public TextView getTxtTeam2() {
        return txtTeam2;
    }

    public void setTxtTeam2(TextView txtTeam2) {
        this.txtTeam2 = txtTeam2;
    }

    public TextView getTxtTeam3() {
        return txtTeam3;
    }

    public void setTxtTeam3(TextView txtTeam3) {
        this.txtTeam3 = txtTeam3;
    }

    public TextView getTxtTeam4() {
        return txtTeam4;
    }

    public void setTxtTeam4(TextView txtTeam4) {
        this.txtTeam4 = txtTeam4;
    }
    public void bind(CompositionGroupe compositionGroupe){
        txtGroupName.setText(compositionGroupe.getGroupeName());
        txtTeam1.setText(compositionGroupe.getTeamOne());
        txtTeam2.setText(compositionGroupe.getTeamTwo());
        txtTeam3.setText(compositionGroupe.getTeamThree());
        txtTeam4.setText(compositionGroupe.getTeamFour());
    }
}

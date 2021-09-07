package com.example.football_score.viewHolder;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.football_score.BuildConfig;
import com.example.football_score.OnButtonValidActionGroup1;
import com.example.football_score.R;
import com.example.football_score.model.Group;

public class GroupViewHolder extends RecyclerView.ViewHolder {
    private TextView vhGroupTitle;
    private TextView vhCountryOne;
    private TextView vhCountryTwo;
    private TextView vhCountryThree;
    private TextView vhCountryFour;
    private Button btnValidez;

    public GroupViewHolder(@NonNull View view) {
        super(view);
        vhGroupTitle=view.findViewById(R.id.raw_titleGroup);
        vhCountryOne=view.findViewById(R.id.raw_countryOne);
        vhCountryTwo=view.findViewById(R.id.raw_countryTwo);
        vhCountryThree=view.findViewById(R.id.raw_countryThree);
        vhCountryFour=view.findViewById(R.id.raw_countryFour);
        btnValidez=view.findViewById(R.id.btnValider);
    }

    public TextView getVhGroupTitle() {
        return vhGroupTitle;
    }

    public void setVhGroupTitle(TextView vhGroupTitle) {
        this.vhGroupTitle = vhGroupTitle;
    }

    public TextView getVhCountryOne() {
        return vhCountryOne;
    }

    public void setVhCountryOne(TextView vhCountryOne) {
        this.vhCountryOne = vhCountryOne;
    }

    public TextView getVhCountryTwo() {
        return vhCountryTwo;
    }

    public void setVhCountryTwo(TextView vhCountryTwo) {
        this.vhCountryTwo = vhCountryTwo;
    }

    public TextView getVhCountryThree() {
        return vhCountryThree;
    }

    public void setVhCountryThree(TextView vhCountryThree) {
        this.vhCountryThree = vhCountryThree;
    }

    public TextView getVhCountryFour() {
        return vhCountryFour;
    }

    public void setVhCountryFour(TextView vhCountryFour) {
        this.vhCountryFour = vhCountryFour;
    }

    public Button getBtnValidez() {
        return btnValidez;
    }

    public void setBtnValidez(Button btnValidez) {
        this.btnValidez = btnValidez;
    }

    public void bind(Group group, OnButtonValidActionGroup1 onButtonValidActionGroup1){
        vhGroupTitle.setText(group.getNameOfGroup());
        vhCountryOne.setText(group.getCountryOneName());
        vhCountryTwo.setText(group.getCountryTwoName());
        vhCountryThree.setText(group.getCountryThreeName());
        vhCountryFour.setText(group.getCountryFourName());
        btnValidez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonValidActionGroup1.group1Save(group);
            }
        });
    }

}

package com.example.football_score.viewHolder;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.football_score.OnButtonActionValidGroup2;
import com.example.football_score.R;
import com.example.football_score.model.Group;

public class Group2ViewHolder extends RecyclerView.ViewHolder {
    private TextView vhGroup2Title;
    private TextView vhCountryOne;
    private TextView vhCountryTwo;
    private TextView vhCountryThree;
    private TextView vhCountryFour;
    private Button btnValideG2;

    public Group2ViewHolder(@NonNull View view) {
        super(view);
        vhGroup2Title=view.findViewById(R.id.raw_titleGroup);
        vhCountryOne=view.findViewById(R.id.raw_countryOne);
        vhCountryTwo=view.findViewById(R.id.raw_countryTwo);
        vhCountryThree=view.findViewById(R.id.raw_countryThree);
        vhCountryFour=view.findViewById(R.id.raw_countryFour);
        btnValideG2=view.findViewById(R.id.btnValiderGroupTwo);
    }
    public TextView getVhGroupTitle() {
        return vhGroup2Title;
    }

    public void setVhGroupTitle(TextView vhGroupTitle) {
        this.vhGroup2Title = vhGroupTitle;
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

    public TextView getVhGroup2Title() {
        return vhGroup2Title;
    }

    public void setVhGroup2Title(TextView vhGroup2Title) {
        this.vhGroup2Title = vhGroup2Title;
    }

    public Button getBtnValideG2() {
        return btnValideG2;
    }

    public void setBtnValideG2(Button btnValideG2) {
        this.btnValideG2 = btnValideG2;
    }

    public void bind(Group group, OnButtonActionValidGroup2 onButtonActionValidGroup2){
        vhGroup2Title.setText(group.getNameOfGroup());
        vhCountryOne.setText(group.getCountryOneName());
        vhCountryTwo.setText(group.getCountryTwoName());
        vhCountryThree.setText(group.getCountryThreeName());
        vhCountryFour.setText(group.getCountryFourName());
        btnValideG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonActionValidGroup2.group2Save(group);
            }
        });
    }
}

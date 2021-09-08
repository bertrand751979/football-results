package com.example.football_score.viewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.football_score.R;
import com.example.football_score.model.Group;

public class Group3ViewHolder extends RecyclerView.ViewHolder {
    private TextView vhGroup3Title;
    private TextView vhCountryOne;
    private TextView vhCountryTwo;
    private TextView vhCountryThree;
    private TextView vhCountryFour;

    public Group3ViewHolder(@NonNull View view) {
        super(view);
        vhGroup3Title=view.findViewById(R.id.raw_titleGroup);
        vhCountryOne=view.findViewById(R.id.raw_countryOne);
        vhCountryTwo=view.findViewById(R.id.raw_countryTwo);
        vhCountryThree=view.findViewById(R.id.raw_countryThree);
        vhCountryFour=view.findViewById(R.id.raw_countryFour);
    }

    public TextView getVhGroup3Title() {
        return vhGroup3Title;
    }

    public void setVhGroup3Title(TextView vhGroup3Title) {
        this.vhGroup3Title = vhGroup3Title;
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



    public void bind(Group group){
        vhGroup3Title.setText(group.getNameOfGroup());
        vhCountryOne.setText(group.getCountryOneName());
        vhCountryTwo.setText(group.getCountryTwoName());
        vhCountryThree.setText(group.getCountryThreeName());
        vhCountryFour.setText(group.getCountryFourName());

    }
}

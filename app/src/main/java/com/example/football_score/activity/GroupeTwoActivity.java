package com.example.football_score.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.football_score.model.Group;
import com.example.football_score.R;

import java.util.ArrayList;

public class GroupeTwoActivity extends AppCompatActivity {
    private EditText nameOfGroup;
    private EditText team1;
    private EditText team2;
    private EditText team3;
    private EditText team4;
    private Button validez;
    private ArrayList<Group> myListGroupTwo=new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        nameOfGroup=findViewById(R.id.groupName);
        team1=findViewById(R.id.counrty1);
        team2=findViewById(R.id.counrty2);
        team3=findViewById(R.id.counrty3);
        team4=findViewById(R.id.counrty4);
        validez=findViewById(R.id.btnValider);
        validez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    private void addTeam(){
        if(nameOfGroup.getText().toString().equalsIgnoreCase("")){
            Toast.makeText(GroupeTwoActivity.this,"Veuillez saisir un nom de group",Toast.LENGTH_SHORT).show();
            return;
        }

        if(team1.getText().toString().equalsIgnoreCase("")){
            Toast.makeText(GroupeTwoActivity.this,"Veuillez saisir team 1",Toast.LENGTH_SHORT).show();
            return;
        }
        if(team2.getText().toString().equalsIgnoreCase("")){
            Toast.makeText(GroupeTwoActivity.this,"Veuillez saisir team 2",Toast.LENGTH_SHORT).show();
            return;
        }
        if(team3.getText().toString().equalsIgnoreCase("")){
            Toast.makeText(GroupeTwoActivity.this,"Veuillez saisir team 3",Toast.LENGTH_SHORT).show();
            return;
        }
        if(team4.getText().toString().equalsIgnoreCase("")){
            Toast.makeText(GroupeTwoActivity.this,"Veuillez saisir team 4",Toast.LENGTH_SHORT).show();
            return;
        }
        Group group= new Group();
        group.setNameOfGroup(nameOfGroup.getText().toString());
        group.setCountryOneName(team1.getText().toString());
        group.setCountryTwoName(team2.getText().toString());
        group.setCountryThreeName(team3.getText().toString());
        group.setCountryFourName(team4.getText().toString());
        myListGroupTwo.add(group);
    }
















}
package com.example.football_score.activity;

import static com.example.football_score.activity.MainActivity.MY_COUNTRY_KEY;
import static com.example.football_score.activity.MainActivity.MY_GROUP_KEY;
import static com.example.football_score.activity.MainActivity.MY_SCORE_KEY;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.football_score.R;
import com.example.football_score.Repository;
import com.example.football_score.SharedPreferencesManager;
import com.example.football_score.fragment.EditTeamScoreFragment;
import com.example.football_score.model.Country;
import com.example.football_score.model.Groupe;

import java.util.ArrayList;
import java.util.List;

public class InscriptionActivity extends AppCompatActivity {
    public static ArrayList<Country> myCountryList=new ArrayList<>();
    private Button btnValidCountry;
    private EditText teamNameEdit;

    public static ArrayList<Groupe> myGroupeList=new ArrayList<>();
    private Button btnValidGroupe;
    private EditText editGroupe;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        teamNameEdit=findViewById(R.id.editCountry);
        btnValidCountry=findViewById(R.id.btnValidCountry);
        editGroupe=findViewById(R.id.editGroup);
        btnValidGroupe=findViewById(R.id.btnValidGroupName);
        btnValidCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addTeam();
            }
        });
        btnValidGroupe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addGroupe();
            }
        });


    }//oncreate

    private void addTeam(){
        Repository.getInstance().teamPreference(this,teamNameEdit.getText().toString());
    }

    private void addGroupe(){
        Repository.getInstance().groupePreference(this,editGroupe.getText().toString());
    }






}//Main

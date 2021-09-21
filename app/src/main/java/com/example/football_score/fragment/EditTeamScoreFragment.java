package com.example.football_score.fragment;

import static com.example.football_score.activity.MainActivity.MY_COUNTRY_KEY;
import static com.example.football_score.activity.MainActivity.MY_SCORE_KEY;
import static com.example.football_score.fragment.DisplayScoreFragment.myScoreList;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.football_score.R;
import com.example.football_score.Repository;
import com.example.football_score.SharedPreferencesManager;
import com.example.football_score.activity.InscriptionActivity;
import com.example.football_score.model.Country;
import com.example.football_score.model.Score;

import java.util.ArrayList;
import java.util.List;

public class EditTeamScoreFragment extends Fragment {
    private EditText teamScoreHome;
    private EditText teamScoreAway;
    private Button btnValideScore;
    private String countrySelectedHome;
    private String countrySelectedAway;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.fragment_score,container,false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        InscriptionActivity.myCountryList= new ArrayList<Country> (SharedPreferencesManager.getInstance(EditTeamScoreFragment.this.getContext()).getCountry(MY_COUNTRY_KEY));


        //List<CompositionGroupe> myPreferenceGroupeList= SharedPreferencesManager.getInstance(EditTeamScoreFragment.this.getContext()).getCompositionGroupe(MY_COMPOSITION_GROUP_KEY);
        //DisplayFragment.displayCompositionGroupeList=new ArrayList<>(myPreferenceGroupeList);
        teamScoreHome=view.findViewById(R.id.scoreHome);
        teamScoreAway=view.findViewById(R.id.scoreAway);
        btnValideScore=view.findViewById(R.id.btnValidScore);
        btnValideScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addScore();
            }
        });

        List<Country> listCountry= SharedPreferencesManager.getInstance(EditTeamScoreFragment.this.getContext()).getCountry(MY_COUNTRY_KEY);
        Spinner spinner=view.findViewById(R.id.spinnerTeamHome);
        ArrayAdapter<Country> adapter = new ArrayAdapter<>(EditTeamScoreFragment.this.getContext(),android.R.layout.simple_spinner_item,listCountry);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Adapter adapter22 = adapterView.getAdapter();
                Country country = (Country) adapter22.getItem(i);
                countrySelectedHome =country.getCountryName();
                Toast.makeText(EditTeamScoreFragment.this.getContext(),"l'element domicile est: "+countrySelectedHome,Toast.LENGTH_SHORT).show();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


        List<Country> listCountry2= SharedPreferencesManager.getInstance(EditTeamScoreFragment.this.getContext()).getCountry(MY_COUNTRY_KEY);
        Spinner spinner2=view.findViewById(R.id.spinnerTeamAway);
        ArrayAdapter<Country> adapter2 = new ArrayAdapter<>(EditTeamScoreFragment.this.getContext(),android.R.layout.simple_spinner_item,listCountry2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Adapter adapter = adapterView.getAdapter();
                Country country = (Country) adapter.getItem(i);
                countrySelectedAway =country.getCountryName();
                Toast.makeText(EditTeamScoreFragment.this.getContext(),"l'element exterieur est: "+countrySelectedAway,Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

    }

    private void addScore(){
        Repository.getInstance().addScoretoDisplay(EditTeamScoreFragment.this.getContext(),countrySelectedHome,countrySelectedAway,teamScoreHome.getText().toString(),teamScoreAway.getText().toString());
    }








}

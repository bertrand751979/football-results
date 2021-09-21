package com.example.football_score.fragment;

import static com.example.football_score.activity.MainActivity.MY_COMPOSITION_GROUP_KEY;
import static com.example.football_score.activity.MainActivity.MY_COUNTRY_KEY;
import static com.example.football_score.activity.MainActivity.MY_GROUP_KEY;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.football_score.R;
import com.example.football_score.Repository;
import com.example.football_score.SharedPreferencesManager;
import com.example.football_score.activity.InscriptionActivity;
import com.example.football_score.model.CompositionGroupe;
import com.example.football_score.model.Country;
import com.example.football_score.model.Groupe;

import java.util.ArrayList;
import java.util.List;

public class EditCompositionGroupFragment extends Fragment {
    private String countrySelected1;
    private String countrySelected2;
    private String countrySelected3;
    private String countrySelected4;
    private String groupeSelected;
    private Button btnsaveGroupe;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.fragment_composition_group,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        btnsaveGroupe = view.findViewById(R.id.btnSaveGroupe);
        btnsaveGroupe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addCompositionGroup();
                Toast.makeText(EditCompositionGroupFragment.this.getContext(),"Taille de la liste= "+Repository.getInstance().appCompositionGroupe.size(),Toast.LENGTH_SHORT).show();

            }
        });

        List<Groupe>listDesGroupe=Repository.getInstance().getListGroup(EditCompositionGroupFragment.this.getContext());
        Spinner spinner = view.findViewById(R.id.spinner1);
        ArrayAdapter<Groupe> adapter = new ArrayAdapter<Groupe>(EditCompositionGroupFragment.this.getContext(), android.R.layout.simple_spinner_item,listDesGroupe);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Adapter adapter = adapterView.getAdapter();
                Groupe groupe = (Groupe) adapter.getItem(i);
                groupeSelected = groupe.getNameOfGroup();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        List<Country>listFirstCountry=Repository.getInstance().getListCountryOne(EditCompositionGroupFragment.this.getContext());
        Spinner spinner2=view.findViewById(R.id.spinner2);
        ArrayAdapter<Country> adapter2 = new ArrayAdapter<>(EditCompositionGroupFragment.this.getContext(),android.R.layout.simple_spinner_item,listFirstCountry);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Adapter adapter2 = adapterView.getAdapter();
                Country country = (Country) adapter2.getItem(i);
                countrySelected1=country.getCountryName();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        List<Country>listSecondCountry=Repository.getInstance().getListCountryTwo(EditCompositionGroupFragment.this.getContext());
        Spinner spinner3=view.findViewById(R.id.spinner3);
        ArrayAdapter<Country> adapter3 = new ArrayAdapter<Country>(EditCompositionGroupFragment.this.getContext(),android.R.layout.simple_spinner_item,listSecondCountry);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Adapter adapter3 = adapterView.getAdapter();
                Country country = (Country) adapter3.getItem(i);
                countrySelected2=country.getCountryName();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        List<Country>listThirdCountry=Repository.getInstance().getListCountryThree(EditCompositionGroupFragment.this.getContext());
        Spinner spinner4=view.findViewById(R.id.spinner4);
        ArrayAdapter<Country> adapter4 = new ArrayAdapter<Country>(EditCompositionGroupFragment.this.getContext(),android.R.layout.simple_spinner_item,listThirdCountry);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Adapter adapter4 = adapterView.getAdapter();
                Country country = (Country) adapter4.getItem(i);
                countrySelected3=country.getCountryName();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        List<Country>listFourthCountry=Repository.getInstance().getListCountryFour(EditCompositionGroupFragment.this.getContext());
        Spinner spinner5=view.findViewById(R.id.spinner5);
        ArrayAdapter<Country> adapter5 = new ArrayAdapter<Country>(EditCompositionGroupFragment.this.getContext(),android.R.layout.simple_spinner_item,listFourthCountry);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Adapter adapter5 = adapterView.getAdapter();
                Country country = (Country) adapter5.getItem(i);
                countrySelected4=country.getCountryName();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
        private void addCompositionGroup(){
            CompositionGroupe compositionGroupe = new CompositionGroupe();
            compositionGroupe.setGroupeName(groupeSelected);
            compositionGroupe.setTeamOne(countrySelected1);
            compositionGroupe.setTeamTwo(countrySelected2);
            compositionGroupe.setTeamThree(countrySelected3);
            compositionGroupe.setTeamFour(countrySelected4);
            Repository.getInstance().appCompositionGroupe.add(compositionGroupe);
            Repository.getInstance().saveListCompositionEditGroup(EditCompositionGroupFragment.this.getContext());

            //SharedPreferencesManager.getInstance(EditCompositionGroupFragment.this.getContext()).saveCompositionGroup(DisplayGroupFragment.myCompositionGroupeList,MY_COMPOSITION_GROUP_KEY);
        }

}

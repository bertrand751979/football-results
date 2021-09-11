package com.example.football_score.fragment;

import static com.example.football_score.activity.InscriptionActivity.myGroupeList;
import static com.example.football_score.activity.MainActivity.MY_COMPOSITION_GROUP_KEY;
import static com.example.football_score.activity.MainActivity.MY_GROUP_KEY;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.football_score.R;
import com.example.football_score.SharedPreferencesManager;
import com.example.football_score.activity.InscriptionActivity;
import com.example.football_score.adapter.CompositionGroupAdapter;
import com.example.football_score.model.CompositionGroupe;
import com.example.football_score.model.Groupe;

import java.util.ArrayList;
import java.util.List;

public class DisplayFragment extends Fragment {
    private RecyclerView recyclerView;
    private CompositionGroupAdapter adapterComposition;
    public static ArrayList<CompositionGroupe> myCompositionGroupeList=new ArrayList<>();
    public static ArrayList<CompositionGroupe> displayCompositionGroupeList=new ArrayList<>();


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        List<CompositionGroupe>myPreferenceGroupeList=SharedPreferencesManager.getInstance(DisplayFragment.this.getContext()).getCompositionGroupe(MY_COMPOSITION_GROUP_KEY);
        displayCompositionGroupeList=new ArrayList<>(myPreferenceGroupeList);
        return inflater.inflate(R.layout.display_composition,container,false);

    }




    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerViewDisplayGroup);
        setViewitem();
    }

    private void setViewitem(){
        recyclerView.setLayoutManager(new LinearLayoutManager(DisplayFragment.this.getContext()));
        adapterComposition= new CompositionGroupAdapter(myCompositionGroupeList);
        recyclerView.setAdapter(adapterComposition);


    }





}

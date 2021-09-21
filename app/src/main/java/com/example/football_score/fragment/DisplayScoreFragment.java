package com.example.football_score.fragment;

import static com.example.football_score.activity.MainActivity.MY_SCORE_KEY;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.football_score.R;
import com.example.football_score.SharedPreferencesManager;
import com.example.football_score.adapter.ScoreAdapter;
import com.example.football_score.model.Score;

import java.util.ArrayList;

public class DisplayScoreFragment extends Fragment {
    private RecyclerView recyclerView;
    private ScoreAdapter adapterScore;
    public static ArrayList<Score>myScoreList=new ArrayList<>();


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.display_team_score,container,false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerViewDisplayScoreTeams);
        //InscriptionActivity.myCountryList = new ArrayList<Country>(SharedPreferencesManager.getInstance(EditTeamScoreFragment.this.getContext()).getCountry(MY_COUNTRY_KEY));
        myScoreList= new ArrayList<Score> (SharedPreferencesManager.getInstance(DisplayScoreFragment.this.getContext()).getScore(MY_SCORE_KEY));
        Toast.makeText(DisplayScoreFragment.this.getContext(), "La liste contient: "+myScoreList.size(), Toast.LENGTH_SHORT).show();


        setViewItem();

    }

        private void setViewItem(){
        recyclerView.setLayoutManager(new LinearLayoutManager(DisplayScoreFragment.this.getContext()));
        adapterScore=new ScoreAdapter(myScoreList);
        recyclerView.setAdapter(adapterScore);
        }



    }

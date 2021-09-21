package com.example.football_score.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.football_score.R;
import com.example.football_score.ScoreViewHolder;
import com.example.football_score.model.CompositionGroupe;
import com.example.football_score.model.Score;
import com.example.football_score.viewHolder.ComppositionGroupViewHolder;
import java.util.ArrayList;

public class ScoreAdapter extends RecyclerView.Adapter<ScoreViewHolder> {
    private ArrayList<Score> listScoreAdapter;

    public ScoreAdapter(ArrayList<Score> listScoreAdapter) {
        this.listScoreAdapter = listScoreAdapter;
    }

    public void setListScoreAdapter(ArrayList<Score> listScoreAdapter) {
        this.listScoreAdapter = listScoreAdapter;
    }

    @NonNull
    @Override
    public ScoreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.raw_team_score,parent,false);
        return new ScoreViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ScoreViewHolder holder, int position) {
        holder.bind(listScoreAdapter.get(position));
    }

    @Override
    public int getItemCount() {
        return listScoreAdapter.size();
    }
}

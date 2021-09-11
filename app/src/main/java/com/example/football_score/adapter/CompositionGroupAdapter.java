package com.example.football_score.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.football_score.R;
import com.example.football_score.model.CompositionGroupe;
import com.example.football_score.viewHolder.ComppositionGroupViewHolder;

import java.util.ArrayList;

public class CompositionGroupAdapter extends RecyclerView.Adapter<ComppositionGroupViewHolder> {
    private ArrayList<CompositionGroupe>listadapter;

    public CompositionGroupAdapter(ArrayList<CompositionGroupe> listadapter) {
        this.listadapter = listadapter;
    }

    public void setListadapter(ArrayList<CompositionGroupe> listadapter) {
        this.listadapter = listadapter;
    }

    @NonNull
    @Override
    public ComppositionGroupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.raw_display_group,parent,false);
        return new ComppositionGroupViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ComppositionGroupViewHolder holder, int position) {
        holder.bind(listadapter.get(position));
    }

    @Override
    public int getItemCount() {
        return listadapter.size();
    }
}

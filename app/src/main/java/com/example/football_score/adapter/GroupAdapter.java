package com.example.football_score.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.football_score.OnButtonValidActionGroup1;
import com.example.football_score.R;
import com.example.football_score.model.Group;
import com.example.football_score.viewHolder.GroupViewHolder;

import java.util.ArrayList;

public class GroupAdapter extends RecyclerView.Adapter<GroupViewHolder> {
private ArrayList<Group>listGroupAdapter;
private OnButtonValidActionGroup1 onButtonValidActionGroup1;

    public GroupAdapter(ArrayList<Group> listGroupAdapter, OnButtonValidActionGroup1 onButtonValidActionGroup1) {
        this.listGroupAdapter = listGroupAdapter;
        this.onButtonValidActionGroup1 = onButtonValidActionGroup1;
    }

    public void setListGroupAdapter(ArrayList<Group> listGroupAdapter) {
        this.listGroupAdapter = listGroupAdapter;
    }

    @NonNull
    @Override
    public GroupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.raw_group,parent,false);
        return new GroupViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GroupViewHolder holder, int position) {
        holder.bind(listGroupAdapter.get(position),onButtonValidActionGroup1);
    }

    @Override
    public int getItemCount() {
        return listGroupAdapter.size();
    }
}

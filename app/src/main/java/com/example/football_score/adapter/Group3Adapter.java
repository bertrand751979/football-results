package com.example.football_score.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.football_score.viewHolder.Group3ViewHolder;
import com.example.football_score.R;
import com.example.football_score.model.Group;

import java.util.ArrayList;

/*public class Group3Adapter extends RecyclerView.Adapter<Group3ViewHolder> {
    private ArrayList<Group> listGroup3Adapter;

    public Group3Adapter(ArrayList<Group> listGroup3Adapter) {
        this.listGroup3Adapter = listGroup3Adapter;
    }

    public void setListGroup3Adapter(ArrayList<Group> listGroup3Adapter) {
        this.listGroup3Adapter = listGroup3Adapter;
    }

    @NonNull
    @Override
    public Group3ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.raw_group,parent,false);
        return new Group3ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Group3ViewHolder holder, int position) {
        holder.bind(listGroup3Adapter.get(position));
    }

    @Override
    public int getItemCount() {
        return listGroup3Adapter.size();
    }
}*/

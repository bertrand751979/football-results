package com.example.football_score.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.football_score.OnButtonActionValidGroup2;
import com.example.football_score.OnButtonActionValidGroup3;
import com.example.football_score.OnButtonActionValidGroup4;
import com.example.football_score.OnButtonValidActionGroup1;
import com.example.football_score.R;
import com.example.football_score.adapter.Group2Adapter;
import com.example.football_score.adapter.Group3Adapter;
import com.example.football_score.adapter.Group4Adapter;
import com.example.football_score.adapter.GroupAdapter;
import com.example.football_score.model.Group;

import java.util.ArrayList;

public class FragmentGroup extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView recyclerView2;
    private RecyclerView recyclerView3;
    private RecyclerView recyclerView4;
    private GroupAdapter adapterGroup;
    private Group2Adapter adapterGroup2;
    private Group3Adapter adapterGroup3;
    private Group4Adapter adapterGroup4;
    private ArrayList<Group>myListGroup1=new ArrayList<>();
    private ArrayList<Group>myListGroup2=new ArrayList<>();
    private ArrayList<Group>myListGroup3=new ArrayList<>();
    private ArrayList<Group>myListGroup4=new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.fragment_group,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerViewUn);
        recyclerView2=view.findViewById(R.id.recyclerViewDeux);
        recyclerView3=view.findViewById(R.id.recyclerViewTrois);
        recyclerView4=view.findViewById(R.id.recyclerViewQuatre);
        setViewItem();
    }

    private void setViewItem(){
        setGroupOne();
        setGroupTwo();
        setGroupThree();
        setGroupFour();
    }

    private void setGroupOne(){
        recyclerView.setLayoutManager(new LinearLayoutManager(FragmentGroup.this.getContext()));
        OnButtonValidActionGroup1 onButtonValidActionGroup1=new OnButtonValidActionGroup1() {
            @Override
            public void group1Save(Group group) {

            }
        };
        adapterGroup=new GroupAdapter(myListGroup1,onButtonValidActionGroup1);
        recyclerView.setAdapter(adapterGroup);
    }
    private void setGroupTwo(){
        recyclerView.setLayoutManager(new LinearLayoutManager(FragmentGroup.this.getContext()));
        OnButtonActionValidGroup2 onButtonActionValidGroup2= new OnButtonActionValidGroup2() {
            @Override
            public void group2Save(Group group) {

            }
        };
        adapterGroup2=new Group2Adapter(myListGroup2,onButtonActionValidGroup2);
        recyclerView.setAdapter(adapterGroup2);
    }

    private void setGroupThree(){
        recyclerView.setLayoutManager(new LinearLayoutManager(FragmentGroup.this.getContext()));
        OnButtonActionValidGroup3 onButtonActionValidGroup3= new OnButtonActionValidGroup3() {
            @Override
            public void group3Save(Group group) {

            }
        };
        adapterGroup3=new Group3Adapter(myListGroup3,onButtonActionValidGroup3);
        recyclerView.setAdapter(adapterGroup3);
    }

    private void setGroupFour(){
        recyclerView.setLayoutManager(new LinearLayoutManager(FragmentGroup.this.getContext()));
        OnButtonActionValidGroup4 onButtonActionValidGroup4= new OnButtonActionValidGroup4() {
            @Override
            public void group4Save(Group group) {

            }
        };
        adapterGroup4=new Group4Adapter(myListGroup4,onButtonActionValidGroup4);
        recyclerView.setAdapter(adapterGroup4);
    }
}

package com.example.football_score.fragment;

import static com.example.football_score.activity.MainActivity.MY_GROUP1_KEY;

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
//import com.example.football_score.adapter.Group2Adapter;
//import com.example.football_score.adapter.Group3Adapter;
//import com.example.football_score.adapter.Group4Adapter;
import com.example.football_score.adapter.GroupAdapter;
import com.example.football_score.model.Group;

import java.util.ArrayList;

public class FragmentGroup extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView recyclerView2;
    private RecyclerView recyclerView3;
    private RecyclerView recyclerView4;
    private GroupAdapter adapterGroup;
   // private Group2Adapter adapterGroup2;
   // private Group3Adapter adapterGroup3;
   // private Group4Adapter adapterGroup4;

    public static ArrayList<Group>myListGroup=new ArrayList<>();
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
        FragmentGroup.myListGroup= new ArrayList<Group> (SharedPreferencesManager.getInstance(FragmentGroup.this.getContext()).getGroup(MY_GROUP1_KEY));
        recyclerView=view.findViewById(R.id.recyclerViewUn);
        //recyclerView2=view.findViewById(R.id.recyclerViewDeux);
        //recyclerView3=view.findViewById(R.id.recyclerViewTrois);
        //recyclerView4=view.findViewById(R.id.recyclerViewQuatre);
        setViewItem();
    }

    private void setViewItem(){
        setGroupOne();
       // setGroupTwo();
       // setGroupThree();
       // setGroupFour();
    }

    private void setGroupOne(){
        recyclerView.setLayoutManager(new LinearLayoutManager(FragmentGroup.this.getContext()));
        adapterGroup=new GroupAdapter(myListGroup);
        recyclerView.setAdapter(adapterGroup);
    }
  /*  private void setGroupTwo(){
        recyclerView2.setLayoutManager(new LinearLayoutManager(FragmentGroup.this.getContext()));
        adapterGroup2=new Group2Adapter(myListGroup2);
        recyclerView.setAdapter(adapterGroup2);
    }

    private void setGroupThree(){
        recyclerView3.setLayoutManager(new LinearLayoutManager(FragmentGroup.this.getContext()));
        adapterGroup3=new Group3Adapter(myListGroup3);
        recyclerView.setAdapter(adapterGroup3);
    }

    private void setGroupFour(){
        recyclerView4.setLayoutManager(new LinearLayoutManager(FragmentGroup.this.getContext()));
        adapterGroup4=new Group4Adapter(myListGroup4);
        recyclerView.setAdapter(adapterGroup4);
    }*/
}

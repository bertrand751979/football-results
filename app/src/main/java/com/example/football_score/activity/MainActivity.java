package com.example.football_score.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.football_score.fragment.FragmentGroup;
import com.example.football_score.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    public static String MY_GROUP1_KEY="myGroup1Keys";
    public static String MY_GROUP2_KEY="myGroup2Key";
    public static String MY_GROUP3_KEY="myGroup3Key";
    public static String MY_GROUP4_KEY="myGroup4Key";

    public static String MT_SCORE_KEY="myScoreKey";
    private BottomNavigationView bottomNav;
    private FloatingActionButton fab;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNav=findViewById(R.id.bottom_navigation);
        fab=findViewById(R.id.floating);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, GroupeOneActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        bottomNav.setSelectedItemId(R.id.nav_teams);
    }


    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.nav_teams:
                    selectedFragment = new FragmentGroup();
                    break;
            }
            switch (item.getItemId()) {
                case R.id.nav_results:
                    selectedFragment = new FragmentGroup();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
            return true;
        }
    };
}

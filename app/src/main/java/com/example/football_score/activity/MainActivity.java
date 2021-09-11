package com.example.football_score.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.football_score.fragment.DisplayFragment;
import com.example.football_score.fragment.ScoreFragment;
import com.example.football_score.R;
import com.example.football_score.fragment.CompositionGroupFragment;
import com.example.football_score.fragment.EditTeamScoreFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    public static String MY_GROUP_KEY="myGroupKeys";
    public static String MY_COUNTRY_KEY="myCountryKey";
    public static String MY_COMPOSITION_GROUP_KEY="myCompositionCountryKey";
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
                Intent intent=new Intent(MainActivity.this,InscriptionActivity.class);
                startActivity(intent);
            }
        });
    }




    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;


            switch (item.getItemId()) {
                case R.id.nav_selection:
                    selectedFragment = new CompositionGroupFragment();
                    break;
            }

           switch (item.getItemId()) {
               case R.id.nav_displayTeams:
                    selectedFragment = new DisplayFragment();
                    break;
            }

            switch (item.getItemId()) {
                case R.id.nav_showGroups:
                    selectedFragment = new EditTeamScoreFragment();
                    break;
            }


            switch (item.getItemId()) {
                case R.id.nav_displayResults:
                    selectedFragment = new ScoreFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
            return true;
        }
    };
}

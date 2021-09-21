package com.example.football_score;

import static com.example.football_score.activity.MainActivity.MY_COMPOSITION_GROUP_KEY;
import static com.example.football_score.activity.MainActivity.MY_COUNTRY_KEY;
import static com.example.football_score.activity.MainActivity.MY_GROUP_KEY;
import static com.example.football_score.activity.MainActivity.MY_SCORE_KEY;

import android.content.Context;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.football_score.activity.InscriptionActivity;
import com.example.football_score.fragment.DisplayGroupFragment;
import com.example.football_score.fragment.EditCompositionGroupFragment;
import com.example.football_score.fragment.EditTeamScoreFragment;
import com.example.football_score.model.CompositionGroupe;
import com.example.football_score.model.Country;
import com.example.football_score.model.Groupe;
import com.example.football_score.model.Score;

import java.security.acl.Group;
import java.util.ArrayList;
import java.util.List;

public class Repository {


    private static Repository instance;
    private ArrayList<Groupe> appGroupeList = new ArrayList<>();
    private ArrayList<Country> appCountryList = new ArrayList<>();
    public ArrayList<CompositionGroupe> appCompositionGroupe = new ArrayList<>();
    private ArrayList<Score> appScoreList = new ArrayList<>();

    //le type private sur le constructeur fait ref a un singleton
    private Repository() {
    }

    public static Repository getInstance() {
        if (instance == null) {
            instance = new Repository();
        }
        return instance;
    }

    //----------------------------InscriptionActivity----------------------------------------
    public void groupePreference(Context context, String groupeName) {
        if (groupeName.equalsIgnoreCase("")) {
            return;
        }
        Groupe groupe = new Groupe();
        groupe.setNameOfGroup(groupeName);
        appGroupeList.add(groupe);
        SharedPreferencesManager.getInstance(context).saveGroupe(appGroupeList, MY_GROUP_KEY);
    }

    public void teamPreference(Context context, String teamName) {
        if (teamName.equalsIgnoreCase("")) {
            return;
        }
        Country country = new Country();
        country.setCountryName(teamName);
        appCountryList.add(country);
        SharedPreferencesManager.getInstance(context).saveCountry(appCountryList, MY_COUNTRY_KEY);
    }


    public List<Groupe> getListGroup(Context context) {
       List<Groupe> listGroupName=SharedPreferencesManager.getInstance(context).getGroupe(MY_GROUP_KEY);
        return listGroupName;
    }

   public List<Country> getListCountryOne(Context context) {
        List<Country>listCountryOne=SharedPreferencesManager.getInstance(context).getCountry(MY_COUNTRY_KEY);
        return listCountryOne;
    }

    public List<Country> getListCountryTwo(Context context) {
        List<Country>listCountry2=SharedPreferencesManager.getInstance(context).getCountry(MY_COUNTRY_KEY);
        return listCountry2;
    }

    public List<Country> getListCountryThree(Context context) {
        List<Country>listCountry3=SharedPreferencesManager.getInstance(context).getCountry(MY_COUNTRY_KEY);
        return listCountry3;
    }

    public List<Country>  getListCountryFour(Context context) {
        List<Country>listCountry4=SharedPreferencesManager.getInstance(context).getCountry(MY_COUNTRY_KEY);
        return listCountry4;
    }


    public List<CompositionGroupe> saveListCompositionEditGroup(Context context) {
        List<CompositionGroupe>listCompositionGroup=SharedPreferencesManager.getInstance(context).saveCompositionGroup(appCompositionGroupe, MY_COMPOSITION_GROUP_KEY);
        return  listCompositionGroup;
    }

    public void addScoretoDisplay(Context context, String homeTeam, String awayTeam, String homeScore, String awayScore) {
        Score score = new Score();
        score.setTeamHome(homeTeam);
        score.setTeamAway(awayTeam);
        score.setScoreTeamHome(homeScore);
        score.setScoreTeamAway(awayScore);
        appScoreList.add(score);
        SharedPreferencesManager.getInstance(context).saveScore(appScoreList, MY_SCORE_KEY);
        Toast.makeText(context, "La taille de la liste est: " + appScoreList.size(), Toast.LENGTH_SHORT).show();
        Toast.makeText(context, "le score home est: " + homeScore, Toast.LENGTH_SHORT).show();
        Toast.makeText(context, "le score exteuieur est: " + awayScore, Toast.LENGTH_SHORT).show();
    }


}

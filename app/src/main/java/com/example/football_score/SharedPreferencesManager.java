package com.example.football_score;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.football_score.model.CompositionGroupe;
import com.example.football_score.model.Country;
import com.example.football_score.model.Groupe;
import com.example.football_score.model.Score;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SharedPreferencesManager {



        public static final String MY_PREF = "AppPreferences";
        private static SharedPreferencesManager INSTANCE = null;
        private SharedPreferences sharedPreferences;

        //pour transformer une classe en singleton mettre prive
        private SharedPreferencesManager(Context context) {
            this.sharedPreferences = context.getSharedPreferences(MY_PREF, 0);
        }

        //ca economise du code c'est un objet partage le singleton est ce que mon objet existe deja cas contraire on la cree
        public static synchronized SharedPreferencesManager getInstance(Context context) {
            if(INSTANCE == null){
                INSTANCE = new SharedPreferencesManager(context);
            }
            return INSTANCE;
        }

        public void save(String key, String value) {
            sharedPreferences.edit().putString(key, value).apply();
        }

        public String get(String key) {

            return this.sharedPreferences.getString(key, null);
        }

        public void remove(String key) {

            sharedPreferences.edit().remove(key).apply();
        }

        public void clear() {

            sharedPreferences.edit().clear().apply();
        }

        public void saveCountry(List<Country> books, String listKey) {
            Gson gson = new Gson();
            //gson.tojson qui transforme la liste en chaine de caractere
            String booksAsString = gson.toJson(books);
            save(listKey,booksAsString);
        }
        public void saveGroupe(List<Groupe> books, String listKey) {
            Gson gson = new Gson();
            //gson.tojson qui transforme la liste en chaine de caractere
            String booksAsString = gson.toJson(books);
            save(listKey,booksAsString);
        }


    public void saveScore(List<Score> books, String listKey) {
        Gson gson = new Gson();
        //gson.tojson qui transforme la liste en chaine de caractere
        String booksAsString = gson.toJson(books);
        save(listKey,booksAsString);
    }
    public List<Score> getScore(String listKey){
        List<Score> booksList = new ArrayList<>();
        Gson gson = new Gson();
        Score[] books = gson.fromJson(get(listKey), Score[].class);
        if (books != null){
            booksList = Arrays.asList(gson.fromJson(get(listKey), Score[].class));
        }
        return  booksList;
    }
    
        public List<CompositionGroupe> saveCompositionGroup(List<CompositionGroupe> books, String listKey) {
            Gson gson = new Gson();
            //gson.tojson qui transforme la liste en chaine de caractere
            String booksAsString = gson.toJson(books);
            save(listKey,booksAsString);
            return books;
        }

        public List<Country> getCountry(String listKey){
            List<Country> booksList = new ArrayList<>();
            Gson gson = new Gson();
            Country[] books = gson.fromJson(get(listKey), Country[].class);
            if (books != null){
                booksList = Arrays.asList(gson.fromJson(get(listKey), Country[].class));
            }
            return  booksList;
        }


        public List<Groupe> getGroupe(String listKey){
            List<Groupe> booksList = new ArrayList<>();
            Gson gson = new Gson();
            Groupe[] books = gson.fromJson(get(listKey), Groupe[].class);
            if (books != null){
                booksList = Arrays.asList(gson.fromJson(get(listKey), Groupe[].class));
            }
            return  booksList;
        }
    public List<CompositionGroupe> getCompositionGroupe(String listKey){
        List<CompositionGroupe> booksList = new ArrayList<>();
        Gson gson = new Gson();
        CompositionGroupe[] books = gson.fromJson(get(listKey), CompositionGroupe[].class);
        if (books != null){
            booksList = Arrays.asList(gson.fromJson(get(listKey), CompositionGroupe[].class));
        }
        return  booksList;
    }
        public void addCountryToList(Country country, String listKey){
            ArrayList<Country> books = new ArrayList<>(getCountry(listKey));
            remove(listKey);
            books.add(country);
            saveCountry(books,listKey);
        }
    }




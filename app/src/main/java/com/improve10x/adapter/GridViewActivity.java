package com.improve10x.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class GridViewActivity extends AppCompatActivity {
    GridView moviesGv;
    public String[] movies = {"SitaRamam","RRR","Sir","Robo","Son of Satyamurthi","Arundathi","Saaho","Bahubali","Eega"};
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        initViews();
        setupAdapter();
        connectAdapter();
    }

    private void initViews() {
        moviesGv = findViewById(R.id.movies_gv);
        moviesGv.setNumColumns(3);
    }

    public  void  setupAdapter(){
        arrayAdapter = new ArrayAdapter(this, R.layout.districts,movies);
    }

    public  void  connectAdapter(){
        moviesGv.setAdapter(arrayAdapter);
    }
}
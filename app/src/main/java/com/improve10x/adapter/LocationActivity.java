package com.improve10x.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class LocationActivity extends AppCompatActivity {
    TextView statesTxt;
    Spinner statesSp;
    public String[] states = {"Arunachal Pradesh","Assam","Bihar","Chhattisgarh"};
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        initViews();
        setAdapter();
        connectAdapter();
    }

    private void initViews() {
        statesTxt = findViewById(R.id.states_txt);
        statesSp = findViewById(R.id.states_sp);
    }

    public  void  setAdapter(){
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,states);
    }

    public  void  connectAdapter(){
        statesSp.setAdapter(adapter);
    }
}
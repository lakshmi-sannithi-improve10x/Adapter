package com.improve10x.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListView2Activity extends AppCompatActivity {
    TextView  districtTxt;
    ListView districtsLv;
    public  String[] districts = {"Kurnool","Nandyal","Kadapa","Nellore","Chittoor","Anathapoor"};
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);
        initViews();
        setupAdapter();
        connectAdapter();
    }

    private void initViews() {
        districtTxt = findViewById(R.id.district_txt);
        districtsLv = findViewById(R.id.districts_lv);
    }

    public  void  setupAdapter(){
        adapter = new ArrayAdapter(this, R.layout.districts,districts);
    }

    public  void  connectAdapter(){
        districtsLv.setAdapter(adapter);
    }
}
package com.improve10x.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerActivity extends AppCompatActivity {
    TextView statesTxt;
    Spinner spinnerSp;
    Button submitBtn;
    public String[] states ={"Andhra Pradesh","Telangana","Karnataka","Delhi","Tamil nadu"};
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        initViews();
        setupAdapter();
        connectAdapter();


    }

    private void initViews() {
        statesTxt = findViewById(R.id.states_txt);
        spinnerSp = findViewById(R.id.spinner_sp);
        submitBtn = findViewById(R.id.submit_btn);
    }

    public void  setupAdapter(){
        adapter = new ArrayAdapter(this, R.layout.states,states);

    }

    public  void  connectAdapter(){
        spinnerSp.setAdapter(adapter);
    }
}
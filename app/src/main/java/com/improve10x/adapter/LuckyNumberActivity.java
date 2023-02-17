package com.improve10x.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class LuckyNumberActivity extends AppCompatActivity {
    TextView luckyNumberTxt;
    Spinner numbersSp;
    Button submitBtn;
    ArrayAdapter adapter;
   public String[] numbers = {"select","1","2","3","4","5","6","7","8","9","10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky_number);
        initViews();
        setupAdapter();
        connectAdapter();
    }

    private void initViews() {
        luckyNumberTxt = findViewById(R.id.luckynumber_txt);
        numbersSp = findViewById(R.id.numbers_sp);
        submitBtn = findViewById(R.id.submit_btn);
    }

    public  void  setupAdapter(){
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,numbers);
    }

    public void connectAdapter(){
        numbersSp.setAdapter(adapter);
    }
}
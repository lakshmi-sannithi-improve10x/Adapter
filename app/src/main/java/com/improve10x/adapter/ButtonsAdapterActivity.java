package com.improve10x.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ButtonsAdapterActivity extends AppCompatActivity {
    Button luckyNumberBtn;
    Button locationBtn;
    Button dateBtn;
    Button teamCBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons_adapter2);
        initViews();
        handleLuckyNumberBtn();
        handleLocationBtn();
        handleDateOfBirthBtn();
        handleTeamCBtn();
    }

    private void initViews() {
        luckyNumberBtn = findViewById(R.id.luckynumber_btn);
        locationBtn = findViewById(R.id.location_btn);
        dateBtn = findViewById(R.id.date_btn);
        teamCBtn = findViewById(R.id.teamc_btn);
    }

    public void handleLuckyNumberBtn() {
        luckyNumberBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, LuckyNumberActivity.class);
            startActivity(intent);
        });
    }

    public void handleLocationBtn() {
        locationBtn.setOnClickListener(view -> {
            Intent locationIntent = new Intent(this, LocationActivity.class);
            startActivity(locationIntent);
        });
    }

    public void handleDateOfBirthBtn() {
        dateBtn.setOnClickListener(view -> {
            Intent dateIntent = new Intent(this, DateOfBirthActivity.class);
            startActivity(dateIntent);
        });
    }

    public void handleTeamCBtn() {
        teamCBtn.setOnClickListener(view -> {
            Intent listViewIntent = new Intent(this, ListViewActivity.class);
            startActivity(listViewIntent);
        });
    }
}
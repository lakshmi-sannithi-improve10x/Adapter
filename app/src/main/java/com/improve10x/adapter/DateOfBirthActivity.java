package com.improve10x.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class DateOfBirthActivity extends AppCompatActivity {
      TextView dateTxt;
      TextView monthTxt;
      TextView yearTxt;
      Spinner datesSp;
      Spinner monthsSp;
      Spinner yearsSp;
      Button submitBtn;
      public String[] dates = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
      public  String[] months = {"01","02","03","04","05","06","07","08","09","10","11","12"};
      public String[] years = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
      ArrayAdapter dateAdapter;
      ArrayAdapter monthAdapter;
      ArrayAdapter yearAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_of_birth);
        initViews();
        setDateAdapter();
        connectDateAdapter();
        setMonthAdapter();
        connectMonthAdapter();
        setYearAdapter();
        connectYearAdapter();
    }

    private void initViews() {
        dateTxt = findViewById(R.id.date_txt);
        monthTxt = findViewById(R.id.month_txt);
        yearTxt = findViewById(R.id.year_txt);
        submitBtn = findViewById(R.id.submit_btn);
        datesSp = findViewById(R.id.dates_sp);
        monthsSp = findViewById(R.id.months_sp);
        yearsSp = findViewById(R.id.years_sp);
    }

    public  void  setDateAdapter(){
        dateAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,dates);
    }

    public  void  connectDateAdapter(){
        datesSp.setAdapter(dateAdapter);

    }

    public  void setMonthAdapter(){
        monthAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,months);
    }

    public void  connectMonthAdapter(){
        monthsSp.setAdapter(monthAdapter);
    }

    public  void setYearAdapter(){
        yearAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,years);
    }

    public  void connectYearAdapter(){
        yearsSp.setAdapter(yearAdapter);
    }
}
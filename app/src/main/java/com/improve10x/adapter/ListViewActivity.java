package com.improve10x.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {
  public String[] members = {"Charan","Manohar","Sai Sri","Siva","Shiv","Surya"};
  ListView membersLv;
  ArrayAdapter membersAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        initViews();
        setAdapter();
        connectAdapter();
    }

    private void initViews() {
        membersLv = findViewById(R.id.members_lv);
    }

    public void  setAdapter(){
        membersAdapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,members);
    }

    public  void  connectAdapter(){
        membersLv.setAdapter(membersAdapter);
    }
}
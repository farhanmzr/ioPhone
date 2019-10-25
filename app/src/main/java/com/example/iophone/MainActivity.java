package com.example.iophone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPhones;
    private ArrayList<Phone> list = new ArrayList<>();
    private String title = "Information Of Phone (ioPhone)";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        rvPhones = findViewById(R.id.rv_phones);
        rvPhones.setHasFixedSize(true);

        list.addAll(PhoneData.getListData());
        showRecyclerCardView();
    }
    private void showRecyclerCardView(){
        rvPhones.setLayoutManager(new LinearLayoutManager(this));
        CardViewPhone cardViewPhone = new CardViewPhone(this, list);
        rvPhones.setAdapter(cardViewPhone);
    }
}

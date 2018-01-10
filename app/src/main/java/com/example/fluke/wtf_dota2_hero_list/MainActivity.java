package com.example.fluke.wtf_dota2_hero_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.fluke.wtf_dota2_hero_list.Controller.HeroController;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.fucking_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        HeroController d = new HeroController(MainActivity.this);
        d.setAdapter(recyclerView);



    }
}

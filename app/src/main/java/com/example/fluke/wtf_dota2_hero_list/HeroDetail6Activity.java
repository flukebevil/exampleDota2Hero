package com.example.fluke.wtf_dota2_hero_list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.example.fluke.wtf_dota2_hero_list.Controller.DetailController;
import com.example.fluke.wtf_dota2_hero_list.model.HeroData;
import org.parceler.Parcels;

public class HeroDetail6Activity extends AppCompatActivity {

    ImageView hero_image;
    TextView hero_name, ero_Desc;
    HeroData heroData;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_detail6);

        Setup();

        Intent intent = getIntent();
        heroData = Parcels.unwrap(intent.getParcelableExtra("WTF_OBJ"));
        Glide.with(this).load(heroData.getHero_image()).into(hero_image);
        hero_name.setText(heroData.getHero_name());
        ero_Desc.setText(heroData.getHero_desc());

        DetailController d = new DetailController(HeroDetail6Activity.this, heroData);
        d.setAdapter(recyclerView);
    }

    private void Setup() {
        recyclerView = findViewById(R.id.shitSkillList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        hero_image = findViewById(R.id.hero_image);
        hero_name = findViewById(R.id.hero_name);
        ero_Desc = findViewById(R.id.hero_Desc);
    }
}

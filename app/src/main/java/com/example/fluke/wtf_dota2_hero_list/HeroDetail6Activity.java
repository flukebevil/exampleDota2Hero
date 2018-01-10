package com.example.fluke.wtf_dota2_hero_list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.fluke.wtf_dota2_hero_list.model.HeroData;

import org.parceler.Parcels;

public class HeroDetail6Activity extends AppCompatActivity {

    ImageView imageskill1,imageskill2,imageskill3,imageskill4,hero_image;
    TextView tvskill1,tvskill2,tvskill3,tvskill4,hero_name,ero_Desc;
    HeroData heroData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_detail6);
        Setup();
      //  heroData = getIntent().getParcelableExtra("WTF_OBJ");
        Intent intent = getIntent();
        heroData = Parcels.unwrap(intent.getParcelableExtra("WTF_OBJ"));

        Glide.with(this).load(heroData.getImg_skill1()).into(imageskill1);
        Glide.with(this).load(heroData.getImg_skill2()).into(imageskill2);
        Glide.with(this).load(heroData.getImg_skill3()).into(imageskill3);
        Glide.with(this).load(heroData.getImg_skill4()).into(imageskill4);

        Glide.with(this).load(heroData.getHero_image()).into(hero_image);

        tvskill1.setText(heroData.getSkill1());
        hero_name.setText(heroData.getHero_name());
        ero_Desc.setText(heroData.getHero_desc());
        tvskill2.setText(heroData.getSkill2());
        tvskill3.setText(heroData.getSkill3());
        tvskill4.setText(heroData.getSkill4());
    }

    private void Setup() {
        imageskill1 = findViewById(R.id.imgskill1);
        imageskill2 = findViewById(R.id.imgskill2);
        imageskill3 = findViewById(R.id.imgskill3);
        hero_image = findViewById(R.id.hero_image);

        imageskill4 = findViewById(R.id.imgskill4);

        tvskill1 = findViewById(R.id.tvskill1);
        hero_name =findViewById(R.id.hero_name);
        ero_Desc = findViewById(R.id.hero_Desc);
        tvskill2 = findViewById(R.id.tvskill2);

        tvskill3 = findViewById(R.id.tvskill3);

        tvskill4 = findViewById(R.id.tvskill4);

    }
}

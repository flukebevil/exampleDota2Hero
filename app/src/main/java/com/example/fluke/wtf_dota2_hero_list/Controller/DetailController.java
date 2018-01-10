package com.example.fluke.wtf_dota2_hero_list.Controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.example.fluke.wtf_dota2_hero_list.Adapter.DetailAdapter;
import com.example.fluke.wtf_dota2_hero_list.model.HeroData;
import java.util.ArrayList;

public class DetailController {

    private Context context;
    private HeroData heroData;
    private ArrayList<String> skill = new ArrayList<>();
    private ArrayList<String> skillImage = new ArrayList<>();

    public DetailController(Context context, HeroData heroData) {
        this.heroData = heroData;
        this.context = context;
    }

    public void setAdapter(RecyclerView recyclerView) {
        recyclerView.setAdapter(new DetailAdapter(getSkll(), getSkillLink(), context));
    }

    public ArrayList<String> getSkll() {
        skill.add(heroData.getSkill1());
        skill.add(heroData.getSkill2());
        skill.add(heroData.getSkill3());
        skill.add(heroData.getSkill4());
        return skill;
    }

    public ArrayList<String> getSkillLink() {
        skillImage.add(heroData.getImg_skill1());
        skillImage.add(heroData.getImg_skill2());
        skillImage.add(heroData.getImg_skill3());
        skillImage.add(heroData.getImg_skill4());
        return skillImage;
    }
}

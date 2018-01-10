package com.example.fluke.wtf_dota2_hero_list.model;

import java.util.List;



public class DataList {
    List<HeroData> heroList;

    public List<HeroData> getHeroList(){
        return heroList;
    }
    public  void setHeroList(List<HeroData> heroList){
        this.heroList = heroList;
    }
}


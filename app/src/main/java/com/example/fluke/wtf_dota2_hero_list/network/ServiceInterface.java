package com.example.fluke.wtf_dota2_hero_list.network;

import com.example.fluke.wtf_dota2_hero_list.model.DataList;
import com.example.fluke.wtf_dota2_hero_list.model.HeroData;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Fluke on 9/1/2561.
 */

public interface ServiceInterface {

    @GET(DotaUrl.LIST_HERO)
    Call<DataList> getHeroListData();


}

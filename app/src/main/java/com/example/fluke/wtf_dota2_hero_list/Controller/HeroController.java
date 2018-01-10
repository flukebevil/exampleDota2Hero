package com.example.fluke.wtf_dota2_hero_list.Controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import com.example.fluke.wtf_dota2_hero_list.Controller.Adapter.HeroAdapter;
import com.example.fluke.wtf_dota2_hero_list.model.DataList;
import com.example.fluke.wtf_dota2_hero_list.network.APIManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class HeroController {
private  Context context;

    public HeroController(Context context) {
        this.context = context;
    }

    public void setAdapter(final RecyclerView recyclerView){
        APIManager.getService().getHeroListData().enqueue(new Callback<DataList>() {
            @Override
            public void onResponse(Call<DataList> call, Response<DataList> response) {
                if (response.body() != null && response.body().getHeroList() != null){
                    recyclerView.setAdapter(new HeroAdapter(response.body().getHeroList(),context));

                }
            }

            @Override
            public void onFailure(Call<DataList> call, Throwable t) {

            }
        });
    }
}

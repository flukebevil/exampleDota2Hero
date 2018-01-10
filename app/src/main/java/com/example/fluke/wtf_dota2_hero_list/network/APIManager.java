package com.example.fluke.wtf_dota2_hero_list.network;

import com.example.fluke.wtf_dota2_hero_list.model.HeroData;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Fluke on 9/1/2561.
 */

public class APIManager {

    public static ServiceInterface service;

    public static ServiceInterface getService() {

        if (service == null)
        {
            service= new Retrofit.Builder()
                    .baseUrl(DotaUrl.BASE_URL).addConverterFactory(GsonConverterFactory.create())
                    .build().create(ServiceInterface.class);
        }


        return service ;
    }

}

package com.example.fluke.wtf_dota2_hero_list.Controller.Holder;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.fluke.wtf_dota2_hero_list.HeroDetail6Activity;
import com.example.fluke.wtf_dota2_hero_list.R;
import com.example.fluke.wtf_dota2_hero_list.model.HeroData;



public class HeroHolder extends RecyclerView.ViewHolder {
    private ImageView iv ;
    private TextView tv;
    private View view;

    public HeroHolder(View itemView) {
        super(itemView);
        iv = itemView.findViewById(R.id.hero_image_main1);
        tv = itemView.findViewById(R.id.hero_name_main1);
        view = itemView;
    }

    public void onBind(final HeroData heroData ,Context context){
        tv.setText(heroData.getHero_name());
        Glide.with(context).load(heroData.getHero_image()).into(iv);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(view.getContext() , HeroDetail6Activity.class);
                s.putExtra("WTF_OBJ",heroData );
                view.getContext().startActivity(s);
            }
        });

    }
}

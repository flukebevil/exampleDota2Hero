package com.example.fluke.wtf_dota2_hero_list.Holder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.example.fluke.wtf_dota2_hero_list.R;


public class DetailHolder extends RecyclerView.ViewHolder {

    private ImageView iv;
    private TextView tv;

    public DetailHolder(View itemView) {
        super(itemView);
        iv = itemView.findViewById(R.id.iv_skill);
        tv = itemView.findViewById(R.id.tv_skill);
    }

    public void onBind(String heroSkill, String skillImage, Context context) {
        tv.setText(heroSkill);
        Glide.with(context).load(skillImage).into(iv);
    }
}

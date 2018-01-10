package com.example.fluke.wtf_dota2_hero_list.Controller.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fluke.wtf_dota2_hero_list.Controller.Holder.HeroHolder;
import com.example.fluke.wtf_dota2_hero_list.model.HeroData;

import java.util.List;
import com.example.fluke.wtf_dota2_hero_list.R;



public class HeroAdapter extends RecyclerView.Adapter {

  private List<HeroData> dataList ;
  private Context context;

   public HeroAdapter(List<HeroData> dataList, Context context){
       this.context = context;
        this.dataList = dataList;
    }




    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hero_list,parent, false);

        return new HeroHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            if (holder instanceof HeroHolder){
                HeroHolder heroHolder = (HeroHolder) holder;
                heroHolder.onBind(dataList.get(position),context);
            }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}

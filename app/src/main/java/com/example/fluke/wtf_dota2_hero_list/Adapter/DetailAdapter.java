package com.example.fluke.wtf_dota2_hero_list.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.fluke.wtf_dota2_hero_list.Holder.DetailHolder;
import com.example.fluke.wtf_dota2_hero_list.R;
import java.util.ArrayList;

public class DetailAdapter extends RecyclerView.Adapter {
    private ArrayList<String> dataList;
    private Context context;
    private ArrayList<String> skillImage;

    public DetailAdapter(ArrayList<String> skillList, ArrayList<String> skillImage, Context context) {
        this.context = context;
        this.dataList = skillList;
        this.skillImage = skillImage;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.skill_item, parent, false);
        return new DetailHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof DetailHolder) {
            DetailHolder detailHolder = (DetailHolder) holder;
            Log.e("wtf", dataList.get(position) + "  " + skillImage.get(position));
            detailHolder.onBind(dataList.get(position).toString(), skillImage.get(position).toString(), context);
        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}



package com.example.fluke.wtf_dota2_hero_list.model;

import android.os.Parcelable;

import org.parceler.Parcel;



@Parcel
public class HeroData implements Parcelable {




    public String getImg_skill1() {
        return img_skill1;
    }

    public String getImg_skill2() {
        return img_skill2;
    }

    public String getImg_skill3() {
        return img_skill3;
    }

    public String getImg_skill4() {
        return img_skill4;
    }

    public String getHero_desc() {
        return hero_desc;
    }

    public String getHero_image() {
        return hero_image;
    }

    public String getHero_name() {
        return hero_name;
    }

    public String getSkill1() {
        return skill1;
    }

    public String getSkill2() {
        return skill2;
    }

    public String getSkill3() {
        return skill3;
    }

    public String getSkill4() {
        return skill4;
    }


    String img_skill2;
    String img_skill3;
    String img_skill1;
    String img_skill4;
    String hero_desc ;
    String hero_image;
    String hero_name;
        String skill1 ;
        String skill2;
        String skill3;
        String skill4;

    public void setImg_skill1(String img_skill1) {
        this.img_skill1 = img_skill1;
    }

    public void setImg_skill2(String img_skill2) {
        this.img_skill2 = img_skill2;
    }

    public void setImg_skill3(String img_skill3) {
        this.img_skill3 = img_skill3;
    }

    public void setImg_skill4(String img_skill4) {
        this.img_skill4 = img_skill4;
    }

    public void setHero_desc(String hero_desc) {
        this.hero_desc = hero_desc;
    }

    public void setHero_image(String hero_image) {
        this.hero_image = hero_image;
    }

    public void setHero_name(String hero_name) {
        this.hero_name = hero_name;
    }

    public void setSkill1(String skill1) {
        this.skill1 = skill1;
    }

    public void setSkill2(String skill2) {
        this.skill2 = skill2;
    }

    public void setSkill3(String skill3) {
        this.skill3 = skill3;
    }

    public void setSkill4(String skill4) {
        this.skill4 = skill4;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeString(this.img_skill1);
        dest.writeString(this.img_skill2);
        dest.writeString(this.img_skill3);
        dest.writeString(this.img_skill4);
        dest.writeString(this.hero_desc);
        dest.writeString(this.hero_image);
        dest.writeString(this.hero_name);
        dest.writeString(this.skill1);
        dest.writeString(this.skill2);
        dest.writeString(this.skill3);
        dest.writeString(this.skill4);
    }

    public HeroData() {
    }

    protected HeroData(android.os.Parcel in) {
        this.img_skill1 = in.readString();
        this.img_skill2 = in.readString();
        this.img_skill3 = in.readString();
        this.img_skill4 = in.readString();
        this.hero_desc = in.readString();
        this.hero_image = in.readString();
        this.hero_name = in.readString();
        this.skill1 = in.readString();
        this.skill2 = in.readString();
        this.skill3 = in.readString();
        this.skill4 = in.readString();
    }

    public static final Parcelable.Creator<HeroData> CREATOR = new Parcelable.Creator<HeroData>() {
        @Override
        public HeroData createFromParcel(android.os.Parcel source) {
            return new HeroData(source);
        }

        @Override
        public HeroData[] newArray(int size) {
            return new HeroData[size];
        }
    };
}

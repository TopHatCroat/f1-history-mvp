package com.antonio.f1nfo.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by antonio on 2/8/16.
 */
public class Season implements Parcelable{
    public static final String name = "season";
    @SerializedName("season")
    @Expose
    String season;

    @SerializedName("url")
    @Expose
    String url;

    protected Season(Parcel in) {
        season = in.readString();
        url = in.readString();
    }

    public static final Creator<Season> CREATOR = new Creator<Season>() {
        @Override
        public Season createFromParcel(Parcel in) {
            return new Season(in);
        }

        @Override
        public Season[] newArray(int size) {
            return new Season[size];
        }
    };

    public String getSeason() {
        return season;
    }

    public String getShortSeason() {
        return season.substring(2);
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(season);
        dest.writeString(url);
    }
}

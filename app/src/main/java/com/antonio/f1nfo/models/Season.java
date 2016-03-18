package com.antonio.f1nfo.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by antonio on 2/8/16.
 */
public class Season {
    @SerializedName("season")
    @Expose
    String season;

    @SerializedName("url")
    @Expose
    String url;

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

}

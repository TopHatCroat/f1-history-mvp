package com.antonio.f1nfo.models.raceResult;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by antonio on 19.03.16..
 */


public class Time {

    @SerializedName("millis")
    @Expose
    private String millis;
    @SerializedName("time")
    @Expose
    private String time;

    public String getMillis() {
        return millis;
    }

    public void setMillis(String millis) {
        this.millis = millis;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}

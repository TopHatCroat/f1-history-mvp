package com.antonio.f1nfo.models.raceResult;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by antonio on 19.03.16..
 */
public class FastestLap {

    @SerializedName("rank")
    @Expose
    private String rank;
    @SerializedName("lap")
    @Expose
    private String lap;
    @SerializedName("Time")
    @Expose
    private Time_ Time;
    @SerializedName("AverageSpeed")
    @Expose
    private com.antonio.f1nfo.models.raceResult.AverageSpeed AverageSpeed;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getLap() {
        return lap;
    }

    public void setLap(String lap) {
        this.lap = lap;
    }

    public Time_ getTime() {
        return Time;
    }

    public void setTime(Time_ Time) {
        this.Time = Time;
    }

    public com.antonio.f1nfo.models.raceResult.AverageSpeed getAverageSpeed() {
        return AverageSpeed;
    }

    public void setAverageSpeed(com.antonio.f1nfo.models.raceResult.AverageSpeed AverageSpeed) {
        this.AverageSpeed = AverageSpeed;
    }

}

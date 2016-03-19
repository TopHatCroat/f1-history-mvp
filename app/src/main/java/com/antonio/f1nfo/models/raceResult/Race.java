package com.antonio.f1nfo.models.raceResult;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by antonio on 19.03.16..
 */
public class Race {

    @SerializedName("season")
    @Expose
    private String season;
    @SerializedName("round")
    @Expose
    private String round;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("raceName")
    @Expose
    private String raceName;
    @SerializedName("Circuit")
    @Expose
    private com.antonio.f1nfo.models.raceResult.Circuit Circuit;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("Results")
    @Expose
    private List<Result> Results = new ArrayList<Result>();


    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public com.antonio.f1nfo.models.raceResult.Circuit getCircuit() {
        return Circuit;
    }

    public void setCircuit(com.antonio.f1nfo.models.raceResult.Circuit Circuit) {
        this.Circuit = Circuit;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<Result> getResults() {
        return Results;
    }

    public void setResults(List<Result> Results) {
        this.Results = Results;
    }

}
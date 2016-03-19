package com.antonio.f1nfo.models.raceResult;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by antonio on 19.03.16..
 */
public class Result {
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("position")
    @Expose
    private String position;
    @SerializedName("positionText")
    @Expose
    private String positionText;
    @SerializedName("points")
    @Expose
    private String points;
    @SerializedName("Driver")
    @Expose
    private com.antonio.f1nfo.models.raceResult.Driver Driver;
    @SerializedName("Constructor")
    @Expose
    private com.antonio.f1nfo.models.raceResult.Constructor Constructor;
    @SerializedName("grid")
    @Expose
    private String grid;
    @SerializedName("laps")
    @Expose
    private String laps;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("Time")
    @Expose
    private com.antonio.f1nfo.models.raceResult.Time Time;
    @SerializedName("FastestLap")
    @Expose
    private com.antonio.f1nfo.models.raceResult.FastestLap FastestLap;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPositionText() {
        return positionText;
    }

    public void setPositionText(String positionText) {
        this.positionText = positionText;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public com.antonio.f1nfo.models.raceResult.Driver getDriver() {
        return Driver;
    }

    public void setDriver(com.antonio.f1nfo.models.raceResult.Driver Driver) {
        this.Driver = Driver;
    }

    public com.antonio.f1nfo.models.raceResult.Constructor getConstructor() {
        return Constructor;
    }

    public void setConstructor(com.antonio.f1nfo.models.raceResult.Constructor Constructor) {
        this.Constructor = Constructor;
    }

    public String getGrid() {
        return grid;
    }

    public void setGrid(String grid) {
        this.grid = grid;
    }

    public String getLaps() {
        return laps;
    }

    public void setLaps(String laps) {
        this.laps = laps;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public com.antonio.f1nfo.models.raceResult.Time getTime() {
        return Time;
    }

    public void setTime(com.antonio.f1nfo.models.raceResult.Time Time) {
        this.Time = Time;
    }

    public com.antonio.f1nfo.models.raceResult.FastestLap getFastestLap() {
        return FastestLap;
    }

    public void setFastestLap(com.antonio.f1nfo.models.raceResult.FastestLap FastestLap) {
        this.FastestLap = FastestLap;
    }
}

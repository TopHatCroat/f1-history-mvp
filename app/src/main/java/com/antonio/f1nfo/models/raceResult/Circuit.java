package com.antonio.f1nfo.models.raceResult;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by antonio on 19.03.16..
 */
public class Circuit {

    @SerializedName("circuitId")
    @Expose
    private String circuitId;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("circuitName")
    @Expose
    private String circuitName;
    @SerializedName("Location")
    @Expose
    private com.antonio.f1nfo.models.raceResult.Location Location;

    public String getCircuitId() {
        return circuitId;
    }

    public void setCircuitId(String circuitId) {
        this.circuitId = circuitId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCircuitName() {
        return circuitName;
    }

    public void setCircuitName(String circuitName) {
        this.circuitName = circuitName;
    }

    public com.antonio.f1nfo.models.raceResult.Location getLocation() {
        return Location;
    }

    public void setLocation(com.antonio.f1nfo.models.raceResult.Location Location) {
        this.Location = Location;
    }

}
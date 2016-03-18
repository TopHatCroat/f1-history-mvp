package com.antonio.f1nfo.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by antonio on 2/9/16.
 */
public class Session {
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
    public Circuit circuit;
    @SerializedName("date")
    @Expose
    private String date;

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

    public Circuit getCircuit() {
        return circuit;
    }

    public void setCircuit(Circuit circuit) {
        this.circuit = circuit;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

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
        private Location location;

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public String getCircuitName() {
            return circuitName;
        }

        public void setCircuitName(String circuitName) {
            this.circuitName = circuitName;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getCircuitId() {
            return circuitId;
        }

        public void setCircuitId(String circuitId) {
            this.circuitId = circuitId;
        }

        public class Location {
            @SerializedName("lat")
            @Expose
            private String lat;
            @SerializedName("long")
            @Expose
            private String _long;
            @SerializedName("locality")
            @Expose
            private String locality;
            @SerializedName("country")
            @Expose
            private String country;

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String get_long() {
                return _long;
            }

            public void set_long(String _long) {
                this._long = _long;
            }

            public String getLocality() {
                return locality;
            }

            public void setLocality(String locality) {
                this.locality = locality;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }
        }
    }

}

package com.antonio.f1nfo.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by antonio on 2/9/16.
 */
public class SessionPOJO {

    @SerializedName("MRData")
    @Expose
    private MRData MRData;

    public MRData getMRData() {
        return MRData;
    }

    public void setMRData(MRData MRData) {
        this.MRData = MRData;
    }

    public class MRData {

        @SerializedName("xmlns")
        @Expose
        private String xmlns;
        @SerializedName("series")
        @Expose
        private String series;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("limit")
        @Expose
        private String limit;
        @SerializedName("offset")
        @Expose
        private String offset;
        @SerializedName("total")
        @Expose
        private String total;
        @SerializedName("RaceTable")
        @Expose
        private RaceTable RaceTable;

        public String getXmlns() {
            return xmlns;
        }

        public void setXmlns(String xmlns) {
            this.xmlns = xmlns;
        }

        public String getSeries() {
            return series;
        }

        public void setSeries(String series) {
            this.series = series;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getLimit() {
            return limit;
        }

        public void setLimit(String limit) {
            this.limit = limit;
        }

        public String getOffset() {
            return offset;
        }

        public void setOffset(String offset) {
            this.offset = offset;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public RaceTable getRaceTable() {
            return RaceTable;
        }

        public void setRaceTable(RaceTable RaceTable) {
            this.RaceTable = RaceTable;
        }

        public class RaceTable {

            @SerializedName("season")
            @Expose
            private String season;
            @SerializedName("Races")
            @Expose
            private List<Session> Races = new ArrayList<Session>();

            public String getSeason() {
                return season;
            }

            public void setSeason(String season) {
                this.season = season;
            }

            public List<Session> getRaces() {
                return Races;
            }

            public void setRaces(List<Session> races) {
                Races = races;
            }
        }

    }

}
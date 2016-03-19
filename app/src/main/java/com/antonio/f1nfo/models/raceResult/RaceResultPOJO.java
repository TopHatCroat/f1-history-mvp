package com.antonio.f1nfo.models.raceResult;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by antonio on 18.03.16..
 */
public class RaceResultPOJO {
    @SerializedName("MRData")
    @Expose
    private RaceResultPOJO.MRData MRData;

    public RaceResultPOJO.MRData getMRData() {
        return MRData;
    }

    public void setMRData(RaceResultPOJO.MRData MRData) {
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
        private RaceResultPOJO.MRData.RaceTable RaceTable;

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

        public RaceResultPOJO.MRData.RaceTable getRaceTable() {
            return RaceTable;
        }

        public void setRaceTable(RaceResultPOJO.MRData.RaceTable RaceTable) {
            this.RaceTable = RaceTable;
        }

        public class RaceTable {

            @SerializedName("season")
            @Expose
            private String season;
            @SerializedName("round")
            @Expose
            private String round;
            @SerializedName("Races")
            @Expose
            private List<Race> Races = new ArrayList<Race>();

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

            public List<Race> getRaces() {
                return Races;
            }

            public void setRaces(List<Race> Races) {
                this.Races = Races;
            }

        }

    }
}

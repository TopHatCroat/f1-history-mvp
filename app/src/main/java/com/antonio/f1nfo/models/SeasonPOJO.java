package com.antonio.f1nfo.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by antonio on 2/8/16.
 */
public class SeasonPOJO {

    @SerializedName("MRData")
    @Expose
    private MRData mrData;

    public MRData getMRData() {
        return mrData;
    }

    public void setMRData(MRData mrData) {
        this.mrData = mrData;
    }

    public class MRData {
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
        @SerializedName("SeasonTable")
        @Expose
        private SeasonTable seasonTable;

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

        public SeasonTable getSeasonTable() {
            return seasonTable;
        }

        public void setSeasonTable(SeasonTable seasonTable) {
            this.seasonTable = seasonTable;
        }
    }

    public class SeasonTable {
        private List<Season> Seasons = new ArrayList<Season>();

        public List<Season> getSeasons() {
            return Seasons;
        }

        public void setSeasons(List<Season> seasons) {
            Seasons = seasons;
        }

    }

}

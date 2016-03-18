package com.antonio.f1nfo.api;

import com.antonio.f1nfo.models.SeasonPOJO;
import com.antonio.f1nfo.models.SessionPOJO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by antonio on 2/8/16.
 */
public interface APIService {

    @GET("f1/seasons.json")
    Call<SeasonPOJO> loadSeasons();

    @GET("f1/{season}.json")
    Call<SessionPOJO> loadSessions(@Path("season") String season);
}

package com.antonio.f1nfo.interactors;

import android.util.Log;

import com.antonio.f1nfo.api.APIService;
import com.antonio.f1nfo.api.ServiceGenerator;
import com.antonio.f1nfo.models.SeasonPOJO;
import com.antonio.f1nfo.presenters.OnFinishedListener;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by antonio on 2/7/16.
 */
public class SeasonsInteractorImpl implements SeasonsInteractor {
    private int currentLatestSeason; //skip
    private int limit;
    private boolean gotEverySeason;

    public SeasonsInteractorImpl() {
        currentLatestSeason = 0;
        limit = 20;
        gotEverySeason = false;
    }

    @Override
    public void getItems(final OnFinishedListener listener) {
        if(gotEverySeason) return; // nothing more to load

        APIService service = ServiceGenerator.createService(APIService.class);
        Call<SeasonPOJO> call = service.loadSeasons(String.valueOf(currentLatestSeason), String.valueOf(limit));
        currentLatestSeason += limit;
        call.enqueue(new Callback<SeasonPOJO>() {
            @Override
            public void onResponse(Call<SeasonPOJO> call, Response<SeasonPOJO> response) {
                Log.i("reposnse", response.body().toString());
                SeasonPOJO seasonPOJO = response.body();
                SeasonPOJO.MRData mrData = seasonPOJO.getMRData();
                SeasonPOJO.SeasonTable seasonTable = mrData.getSeasonTable();
                if(seasonTable.getSeasons().size() == 0){
                    gotEverySeason = true;
                } else{
                    listener.onFinished(seasonTable.getSeasons());
                }

            }

            @Override
            public void onFailure(Call<SeasonPOJO> call, Throwable t) {

                listener.onFailure("Data could not be loaded");
            }
        });
    }
}

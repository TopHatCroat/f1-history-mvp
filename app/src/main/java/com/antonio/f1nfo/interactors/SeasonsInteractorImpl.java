package com.antonio.f1nfo.interactors;

import android.util.Log;

import com.antonio.f1nfo.api.APIService;
import com.antonio.f1nfo.api.ServiceGenerator;
import com.antonio.f1nfo.models.SeasonPOJO;
import com.antonio.f1nfo.presenters.OnFinishedSeasonListener;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by antonio on 2/7/16.
 */
public class SeasonsInteractorImpl implements SeasonsInteractor {
    @Override
    public void getItems(final OnFinishedSeasonListener listener) {
        APIService service = ServiceGenerator.createService(APIService.class);
        Log.i("getItems", "called");
        Call<SeasonPOJO> call = service.loadSeasons();
        Log.i("services", "loaded");

        call.enqueue(new Callback<SeasonPOJO>() {
            @Override
            public void onResponse(Call<SeasonPOJO> call, Response<SeasonPOJO> response) {
                Log.i("reposnse", response.body().toString());
                SeasonPOJO seasonPOJO = response.body();
                SeasonPOJO.MRData mrData = seasonPOJO.getMRData();
                SeasonPOJO.SeasonTable seasonTable = mrData.getSeasonTable();

                listener.onFinished(seasonTable.getSeasons());
            }

            @Override
            public void onFailure(Call<SeasonPOJO> call, Throwable t) {

                listener.onFailiure("Data could not be loaded");
            }
        });
    }
}

package com.antonio.f1nfo.interactors;

import com.antonio.f1nfo.api.APIService;
import com.antonio.f1nfo.api.ServiceGenerator;
import com.antonio.f1nfo.models.Session;
import com.antonio.f1nfo.models.raceResult.Race;
import com.antonio.f1nfo.models.raceResult.RaceResultPOJO;
import com.antonio.f1nfo.presenters.OnFinishedRaceResultListener;
import com.google.android.gms.common.api.Api;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by antonio on 19.03.16..
 */
public class RaceResultInteractorImpl implements RaceResultInteractor {
    private final Session session;
    APIService service;

    public RaceResultInteractorImpl(Session session) {
        this.session = session;
    }

    @Override
    public void getRace(final OnFinishedRaceResultListener listener) {
        service = ServiceGenerator.createService(APIService.class);

        Call<RaceResultPOJO> call = service.loadRaceResult(session.getSeason(), session.getRound());

        call.enqueue(new Callback<RaceResultPOJO>() {
            @Override
            public void onResponse(Call<RaceResultPOJO> call, Response<RaceResultPOJO> response) {
                listener.onFinished(new ArrayList<Race>(response.body().getMRData().getRaceTable().getRaces()));
            }

            @Override
            public void onFailure(Call<RaceResultPOJO> call, Throwable t) {
                listener.onFailure("Unable to load race results");
            }
        });
    }
}

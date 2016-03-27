package com.antonio.f1nfo.interactors;

import com.antonio.f1nfo.api.APIService;
import com.antonio.f1nfo.api.ServiceGenerator;
import com.antonio.f1nfo.models.Season;
import com.antonio.f1nfo.models.Session;
import com.antonio.f1nfo.models.SessionPOJO;
import com.antonio.f1nfo.presenters.OnFinishedListener;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by antonio on 2/7/16.
 */
public class SessionsInteractorImpl implements SessionsInteractor {
    Season season;

    public SessionsInteractorImpl(Season season){
        this.season = season;
    }

    @Override
    public void getItems(final OnFinishedListener listener) {
        APIService service = ServiceGenerator.createService(APIService.class);
        Call<SessionPOJO> call = service.loadSessions(season.getSeason());

        call.enqueue(new Callback<SessionPOJO>() {
            @Override
            public void onResponse(Call<SessionPOJO> call, Response<SessionPOJO> response) {
                listener.onFinished(new ArrayList<Session>(response.body().getMRData().getRaceTable().getRaces()));
            }

            @Override
            public void onFailure(Call<SessionPOJO> call, Throwable t) {
                listener.onFailure("Unable to load season");
            }
        });
    }
}

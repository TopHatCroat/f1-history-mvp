package com.antonio.f1nfo.presenters;

import com.antonio.f1nfo.interactors.RaceResultInteractor;
import com.antonio.f1nfo.interactors.RaceResultInteractorImpl;
import com.antonio.f1nfo.models.Season;
import com.antonio.f1nfo.models.Session;
import com.antonio.f1nfo.models.raceResult.Race;
import com.antonio.f1nfo.views.RaceResultView;

import java.util.List;

/**
 * Created by antonio on 19.03.16..
 */
public class RaceResultPresenterImpl implements RaceResultPresenter, OnFinishedListener<Race> {
    RaceResultView raceResultView;
    RaceResultInteractor raceResultInteractor;
    Session session;

    public RaceResultPresenterImpl(RaceResultView raceResultView, Session session){
        this.raceResultView = raceResultView;
        this.raceResultInteractor = new RaceResultInteractorImpl(session);
        this.session = session;
    }


    @Override
    public void onResume() {
        if(raceResultView != null){
            raceResultView.showProgress();
        }

        raceResultInteractor.getRace(this);
    }

    @Override
    public void onDestroy() {
        raceResultView = null;
    }

    @Override
    public void onFinished(List<Race> race) {
        if(raceResultView != null){
            raceResultView.setRace(race);
            raceResultView.hideProgress();
        }
    }

    @Override
    public void onFailure(String message) {
        if(raceResultView != null){
            raceResultView.hideProgress();
            raceResultView.showMessage(message);
        }
    }
}

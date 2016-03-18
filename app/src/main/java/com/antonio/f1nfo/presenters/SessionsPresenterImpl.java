package com.antonio.f1nfo.presenters;

import com.antonio.f1nfo.interactors.SessionsInteractor;
import com.antonio.f1nfo.interactors.SessionsInteractorImpl;
import com.antonio.f1nfo.models.Season;
import com.antonio.f1nfo.models.Session;
import com.antonio.f1nfo.presenters.SessionsPresenter;
import com.antonio.f1nfo.views.SessionView;

import java.util.List;

/**
 * Created by antonio on 2/9/16.
 */
public class SessionsPresenterImpl implements SessionsPresenter, OnFinishedSessionListener {
    SessionView sessionView;
    SessionsInteractor sessionsInteractor;
    Season season;

    public SessionsPresenterImpl(SessionView sessionView, Season season) {
        this.sessionView = sessionView;
        this.season = season;
        this.sessionsInteractor = new SessionsInteractorImpl(season);
    }

    @Override
    public void onResume() {
        if(sessionView != null){
            sessionView.showProgress();
        }
        sessionsInteractor.getItems(this);
    }

    @Override
    public void onDestroy() {
        sessionView = null;
    }

    @Override
    public void onFinished(List<Session> sessions) {
        if(sessionView != null){
            sessionView.setSessions(sessions);
        }
    }

    @Override
    public void onFailiure(String message) {
        sessionView.showMessage(message);
    }
}
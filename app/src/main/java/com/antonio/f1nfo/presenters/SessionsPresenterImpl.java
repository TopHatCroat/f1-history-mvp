package com.antonio.f1nfo.presenters;

import com.antonio.f1nfo.interactors.SessionsInteractor;
import com.antonio.f1nfo.interactors.SessionsInteractorImpl;
import com.antonio.f1nfo.models.Season;
import com.antonio.f1nfo.models.Session;
import com.antonio.f1nfo.views.BasicView;

import java.util.List;

/**
 * Created by antonio on 2/9/16.
 */
public class SessionsPresenterImpl implements SessionsPresenter, OnFinishedListener<Session> {
    BasicView sessionView;
    SessionsInteractor sessionsInteractor;
    Season season;

    public SessionsPresenterImpl(BasicView sessionView, Season season) {
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
    public void onItemClick(Session session) {
        if(sessionView != null){
            sessionView.navigateForward(session);
        }
    }

    @Override
    public void onDestroy() {
        sessionView = null;
    }

    @Override
    public void onFinished(List<Session> sessions) {
        if(sessionView != null){
            sessionView.setItems(sessions);
            sessionView.hideProgress();
        }
    }

    @Override
    public void onFailure(String message) {
        sessionView.showMessage(message);
    }
}

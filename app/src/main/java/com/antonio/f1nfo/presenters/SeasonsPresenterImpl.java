package com.antonio.f1nfo.presenters;

import com.antonio.f1nfo.interactors.SeasonsInteractor;
import com.antonio.f1nfo.interactors.SeasonsInteractorImpl;
import com.antonio.f1nfo.models.Season;
import com.antonio.f1nfo.views.BasicView;

import java.util.List;

/**
 * Created by antonio on 2/7/16.
 */
public class SeasonsPresenterImpl implements SeasonPresenter, OnFinishedSeasonListener {
    private BasicView seasonsView;
    private SeasonsInteractor seasonsInteractor;


    public SeasonsPresenterImpl(BasicView seasonsView) {
        this.seasonsView = seasonsView;
        this.seasonsInteractor = new SeasonsInteractorImpl();
    }

    @Override
    public void onResume() {
        if(seasonsView != null){
            seasonsView.showProgress();
        }

        seasonsInteractor.getItems(this);
    }

    @Override
    public void onItemClick(Season season) {
        if(seasonsView != null){
            seasonsView.navigateForward(season);
        }
    }

    @Override
    public void onDestroy() {
        seasonsView = null;
    }

    @Override
    public void onFinished(List<Season> seasons) {
        if(seasonsView != null){
            seasonsView.setItems(seasons);
            seasonsView.hideProgress();
        }
    }

    @Override
    public void onFailiure(String message) {
        seasonsView.showMessage(message);
    }
}

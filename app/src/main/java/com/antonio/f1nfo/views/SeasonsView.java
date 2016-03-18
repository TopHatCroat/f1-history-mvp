package com.antonio.f1nfo.views;

import com.antonio.f1nfo.models.Season;

import java.util.List;

/**
 * Created by antonio on 2/7/16.
 */
public interface SeasonsView {

    void showProgress();
    void hideProgress();
    void setItems(List<Season> seasons);
    void showMessage(String message);
    void navigateToSeason(Season season);
}

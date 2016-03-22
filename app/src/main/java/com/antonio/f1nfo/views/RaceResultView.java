package com.antonio.f1nfo.views;

import com.antonio.f1nfo.models.raceResult.Race;

import java.util.List;

/**
 * Created by antonio on 19.03.16..
 */
public interface RaceResultView{
    void showProgress();
    void hideProgress();
    void showMessage(String message);
    void setRace(List<Race> race);
}

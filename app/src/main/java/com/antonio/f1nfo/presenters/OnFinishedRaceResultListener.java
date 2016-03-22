package com.antonio.f1nfo.presenters;

import com.antonio.f1nfo.models.raceResult.Race;

import java.util.List;

/**
 * Created by antonio on 19.03.16..
 */
public interface OnFinishedRaceResultListener {
    void onFinished(List<Race> race);
    void onFailure(String message);
}

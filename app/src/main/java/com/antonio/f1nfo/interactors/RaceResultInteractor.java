package com.antonio.f1nfo.interactors;

import com.antonio.f1nfo.models.raceResult.Race;
import com.antonio.f1nfo.presenters.OnFinishedRaceResultListener;

/**
 * Created by antonio on 19.03.16..
 */
public interface RaceResultInteractor {
    void getRace(OnFinishedRaceResultListener listener);
}

package com.antonio.f1nfo.interactors;

import com.antonio.f1nfo.presenters.OnFinishedSeasonListener;

/**
 * Created by antonio on 2/7/16.
 */
public interface SeasonsInteractor {
    void getItems(OnFinishedSeasonListener listener);
}

package com.antonio.f1nfo.interactors;

import com.antonio.f1nfo.presenters.OnFinishedListener;

/**
 * Created by antonio on 2/7/16.
 */
public interface SeasonsInteractor {
    void getItems(int skip, int totalItemCount, final OnFinishedListener listener);
}

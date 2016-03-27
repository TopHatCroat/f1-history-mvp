package com.antonio.f1nfo.presenters;

import com.antonio.f1nfo.models.Season;

/**
 * Created by antonio on 2/7/16.
 */
public interface SeasonPresenter {

    void onResume();
    void onItemClick(Season season);
    void onDestroy();
    void onUpdate();
}

package com.antonio.f1nfo.presenters;

import com.antonio.f1nfo.models.Session;

/**
 * Created by antonio on 2/7/16.
 */
public interface SessionsPresenter {

    void onResume();
    void onItemClick(Session session);
    void onDestroy();
}

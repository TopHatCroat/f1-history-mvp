package com.antonio.f1nfo.views;

import com.antonio.f1nfo.models.Session;

import java.util.List;

/**
 * Created by antonio on 2/9/16.
 */
public interface SessionView {
    void setSessions(List<Session> sessions);
    void showProgress();
    void hideProgress();
    void showMessage(String message);
    void navigateToSeasons();
}

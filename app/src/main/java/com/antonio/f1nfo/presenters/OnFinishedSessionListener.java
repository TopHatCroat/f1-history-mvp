package com.antonio.f1nfo.presenters;

import com.antonio.f1nfo.models.Season;
import com.antonio.f1nfo.models.Session;

import java.util.List;

/**
 * Created by antonio on 2/7/16.
 */
public interface OnFinishedSessionListener {

    void onFinished(List<Session> seasons);

    void onFailiure(String message);
}

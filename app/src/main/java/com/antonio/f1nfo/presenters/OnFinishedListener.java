package com.antonio.f1nfo.presenters;

import com.antonio.f1nfo.models.Season;

import java.util.List;

/**
 * Created by antonio on 2/7/16.
 */
public interface OnFinishedListener<T> {
    void onFinished(List<T> seasons);
    void onFailure(String message);
}

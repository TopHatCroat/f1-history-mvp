package com.antonio.f1nfo.views;

import com.antonio.f1nfo.models.Season;

import java.util.List;

/**
 * Created by antonio on 18.03.16..
 */
public interface BasicView<T> {
    void showProgress();
    void hideProgress();
    void showMessage(String message);
    void setItems(List<T> items);
    void navigateForward(T parcel);
}

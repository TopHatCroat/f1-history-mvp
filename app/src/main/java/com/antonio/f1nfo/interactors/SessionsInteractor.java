package com.antonio.f1nfo.interactors;
import com.antonio.f1nfo.presenters.OnFinishedSessionListener;

/**
 * Created by antonio on 2/7/16.
 */
public interface SessionsInteractor {
    void getItems(OnFinishedSessionListener listener);
}

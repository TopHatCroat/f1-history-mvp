package com.antonio.f1nfo.adapters;

import android.widget.AbsListView;

/**
 * Created by antonio on 29.03.16..
 */
public abstract class CustomScrollListener implements AbsListView.OnScrollListener {
    int limit = 10;
    int skip = 0;
    int startingIndex = 0;
    int totalLastCount = 0;
    boolean getting = true;

    public CustomScrollListener(){}

    public CustomScrollListener(int limit){
        this.limit = limit;
    }

    public CustomScrollListener(int limit, int skip){
        this.limit = limit;
        this.skip = skip;
        this.startingIndex = skip;
    }


    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {

    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        if(totalItemCount < totalLastCount){
            skip = startingIndex;
            totalLastCount = totalItemCount;
            if(totalItemCount == 0)
                getting = true;
        }

        if(getting && (totalItemCount > totalLastCount)){
            getting = false;
            totalLastCount = totalItemCount;
            skip = totalItemCount;
        }

        if(!getting && ((firstVisibleItem + visibleItemCount + limit) >= totalItemCount))
            getting = onGetMoreItems(skip, totalItemCount);
    }

    public abstract boolean onGetMoreItems(int skip, int totalItemCount);
}

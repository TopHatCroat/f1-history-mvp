package com.antonio.f1nfo.views;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.antonio.f1nfo.R;
import com.antonio.f1nfo.adapters.CustomScrollListener;
import com.antonio.f1nfo.adapters.SeasonsListAdapter;
import com.antonio.f1nfo.models.Season;
import com.antonio.f1nfo.presenters.SeasonPresenter;
import com.antonio.f1nfo.presenters.SeasonsPresenterImpl;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by antonio on 2/7/16.
 */
public class SeasonsActivity extends Activity implements BasicView<Season>{

    @Bind(R.id.list_view_seasons)
    ListView listView;
    @Bind(R.id.progress_seasons)
    ProgressBar progressBar;
    @Bind(R.id.coordinator_seasons)
    CoordinatorLayout coordinatorLayout;
    SeasonPresenter presenter;
    Snackbar snackbar;
    SeasonsListAdapter seasonsListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seasons_activity);
        ButterKnife.bind(this);
        presenter = new SeasonsPresenterImpl(this);
        presenter.onResume(); //// FIXME: 29.03.16. it should be in onResume, dumbass

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    @Override
    public void showProgress() {
        listView.setVisibility(View.INVISIBLE);
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
        listView.setVisibility(View.VISIBLE);
    }

    @Override
    public void setItems(final List<Season> seasons) {
        if(seasonsListAdapter == null){
            seasonsListAdapter = new SeasonsListAdapter(this, seasons, presenter);
            listView.setAdapter(seasonsListAdapter);
            listView.setOnScrollListener(new CustomScrollListener() {
                @Override
                public boolean onGetMoreItems(int skip, int totalItemCount) {
                    presenter.onUpdate(skip, totalItemCount);
                    if(seasons.size() == 0) return false;
                    else return true;
                }
            });
        } else {
            seasonsListAdapter.updateItems(seasons);
        }
        seasonsListAdapter.notifyDataSetChanged();
    }

    @Override
    public void navigateForward(Season parcel) {
        Intent intent = new Intent(this, SessionsActivity.class);
        intent.putExtra(Season.name, parcel);
        startActivity(intent);
    }

    @Override
    public void showMessage(String message) {
        snackbar = Snackbar.make(coordinatorLayout, message, Snackbar.LENGTH_LONG);
        snackbar.show();
    }
}

package com.antonio.f1nfo.views;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import com.antonio.f1nfo.R;
import com.antonio.f1nfo.models.Season;
import com.antonio.f1nfo.models.Session;
import com.antonio.f1nfo.adapters.SessionsListAdapter;
import com.antonio.f1nfo.presenters.SessionsPresenter;
import com.antonio.f1nfo.presenters.SessionsPresenterImpl;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by antonio on 2/9/16.
 */
public class SessionsActivity extends Activity implements BasicView<Session>{
    @Bind(R.id.sessions_recycler)
    RecyclerView recyclerView;
    @Bind(R.id.sessions_progress_bar)
    ProgressBar progressBar;
    @Bind(R.id.coordinator_sessions)
    CoordinatorLayout coordinatorLayout;
    Snackbar snackbar;

    Season season;
    SessionsPresenter presenter;

    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sessions_activity);
        ButterKnife.bind(this);

        season = getIntent().getExtras().getParcelable(Season.name);

        setRecyclerView();

        presenter = new SessionsPresenterImpl(this, season);
    }

    private void setRecyclerView() {
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void showProgress() {
        recyclerView.setVisibility(View.INVISIBLE);
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
        recyclerView.setVisibility(View.VISIBLE);
    }

    @Override
    public void showMessage(String message) {
        hideProgress();
        snackbar = Snackbar.make(coordinatorLayout, message, Snackbar.LENGTH_LONG);
        snackbar.show();
    }

    @Override
    public void setItems(List<Session> sessions) {
        adapter = new SessionsListAdapter(sessions);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void navigateForward(Session parcel) {

    }

}

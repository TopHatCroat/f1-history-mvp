package com.antonio.f1nfo.views;


import android.app.Activity;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.antonio.f1nfo.R;
import com.antonio.f1nfo.adapters.RaceResultRecyclerAdapter;
import com.antonio.f1nfo.models.Session;
import com.antonio.f1nfo.models.raceResult.Race;
import com.antonio.f1nfo.models.raceResult.Result;
import com.antonio.f1nfo.presenters.RaceResultPresenter;
import com.antonio.f1nfo.presenters.RaceResultPresenterImpl;
import com.antonio.f1nfo.presenters.SessionsPresenterImpl;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by antonio on 19.03.16..
 */
public class RaceResultActivity extends Activity implements RaceResultView {
    @Bind(R.id.date_race_activity)
    TextView dateTextView;
    @Bind(R.id.circut_name_race_result_activity)
    TextView circuitNameTextView;
    @Bind(R.id.location_race_result_activity)
    TextView locationTextView;
    @Bind(R.id.progress_race_result_activity)
    ProgressBar progressBar;
    @Bind(R.id.recycler_race_result_activity)
    RecyclerView recyclerView;
    @Bind(R.id.content_race_result)
    RelativeLayout relativeLayout;
    CoordinatorLayout coordinatorLayout;
    Snackbar snackbar;
    RaceResultPresenter raceResultPresenter;
    RecyclerView.LayoutManager layoutManager;
    Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.race_result_activity);
        ButterKnife.bind(this);

        session = getIntent().getExtras().getParcelable(Session.name);

        raceResultPresenter = new RaceResultPresenterImpl(this, session);
        setRecyclerView();
    }

    private void setRecyclerView() {
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        raceResultPresenter.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        raceResultPresenter.onDestroy();
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        relativeLayout.setVisibility(View.INVISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
        relativeLayout.setVisibility(View.VISIBLE);
    }

    @Override
    public void showMessage(String message) {
        snackbar = Snackbar.make(coordinatorLayout, message, Snackbar.LENGTH_SHORT);
        snackbar.show();
    }

    @Override
    public void setRace(List<Race> races) {
        Race race = races.get(0);
        dateTextView.setText(race.getDate());
        locationTextView.setText(race.getCircuit().getLocation().getCountry() + ", " +
                                 race.getCircuit().getLocation().getLocality());
        circuitNameTextView.setText(race.getCircuit().getCircuitName());

        recyclerView.setAdapter(new RaceResultRecyclerAdapter(race.getResults()));
    }

}

//package com.antonio.f1nfo;
//
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.view.View;
//import android.widget.ProgressBar;
//
//import com.antonio.f1nfo.adapters.SeasonsListAdapter;
//import com.antonio.f1nfo.models.Session;
//
//import java.util.List;
//
//import butterknife.Bind;
//import butterknife.ButterKnife;
//
///**
// * Created by antonio on 2/6/16.
// */
//public class SessionActivity extends Activity implements SessionView {
//
//    @Bind(R.id.session_progress_bar)private ProgressBar progressBar;
//    @Bind(R.id.session_recycler) RecyclerView recycler;
//    private RecyclerView.Adapter adapter;
//    private RecyclerView.LayoutManager layoutManager;
//    private SessionPresenter presenter;
//    private SessionAdapter sessionAdapter;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.sessions_activity);
//        ButterKnife.bind(this);
//        sessionAdapter = new SessionAdapter();
//        layoutManager = new LinearLayoutManager(this);
//
//
//        initSessionsRecycler();
//
//    }
//
//    private void initSessionsRecycler() {
//        recycler.setHasFixedSize(true);
//        recycler.setAdapter(adapter);
//        recycler.setLayoutManager(layoutManager);
//        //you should add animations in the future
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//    }
//
//    @Override
//    public void showProgress() {
//        recycler.setVisibility(View.INVISIBLE);
//        progressBar.setVisibility(View.VISIBLE);
//    }
//
//    @Override
//    public void hideProgress() {
//        progressBar.setVisibility(View.INVISIBLE);
//        recycler.setVisibility(View.VISIBLE);
//    }
//
//    @Override
//    public void setItems(List<Session> sessions) {
//        //recycler.setAdapter(new SeasonsListAdapter(this, sessions));
//    }
//
//    @Override
//    public void showMessage(String message) {
//
//    }
//}

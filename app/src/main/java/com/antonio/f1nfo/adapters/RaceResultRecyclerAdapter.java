package com.antonio.f1nfo.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.antonio.f1nfo.R;
import com.antonio.f1nfo.models.raceResult.Result;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by antonio on 22.03.16..
 */
public class RaceResultRecyclerAdapter extends RecyclerView.Adapter<RaceResultRecyclerAdapter.ViewHolder> {
    private List<Result> results;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        @Bind(R.id.constructor_name_race_result_item)
        TextView constructorName;
        @Bind(R.id.driver_name_race_result_item)
        TextView driverName;
        @Bind(R.id.fastest_time_race_result_item)
        TextView fastestTime;
        @Bind(R.id.finishing_time_race_result_item)
        TextView finishingTime;
        @Bind(R.id.position_race_result_item)
        TextView finishingPosition;

        public ViewHolder(View view){
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    public RaceResultRecyclerAdapter(List<Result> results) {
        this.results = results;
    }

    @Override
    public RaceResultRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.race_result_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Result result = results.get(position);
        holder.constructorName.setText(result.getConstructor().getName());
        holder.driverName.setText(result.getDriver().getGivenName() + " " + result.getDriver().getFamilyName());
        try {
            holder.fastestTime.setText(result.getFastestLap().getTime().getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            holder.finishingTime.setText(result.getTime().getTime());
        } catch (Exception e) {
            holder.finishingTime.setText(R.string.did_not_finish);
        }
        holder.finishingPosition.setText(result.getPositionText());

    }

    @Override
    public int getItemCount() {
        return results.size();
    }
}

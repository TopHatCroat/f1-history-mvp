package com.antonio.f1nfo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.antonio.f1nfo.R;
import com.antonio.f1nfo.models.Season;
import com.antonio.f1nfo.presenters.SeasonPresenter;
import com.antonio.f1nfo.presenters.SessionsPresenter;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by antonio on 2/7/16.
 */
public class SeasonsListAdapter extends ArrayAdapter<Season> implements View.OnClickListener {

    private Context context;
    private List<Season> seasons;
    private SeasonPresenter presenter;

    public SeasonsListAdapter(Context context, List<Season> objects, SeasonPresenter presenter) {
        super(context, 0, objects);
        this.context = context;
        this.seasons = objects;
        this.presenter = presenter;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        final Season season = getItem(position);
        ViewHolder holder;

        if(convertView != null){
            holder = (ViewHolder) convertView.getTag();
        } else {
            convertView = LayoutInflater.from(context).inflate(R.layout.season_item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }

        holder.shortSeason.setText(season.getShortSeason());
        holder.seasonTextView.setText(season.getSeason());

        return convertView;
    }

    @Override
    public void onClick(View v) {
        presenter.onItemClick((Season) v.getTag());
    }
//
//    public interface OnItemClickListener{
//        void onItemClick(View view, Season season);
//    }


    static class ViewHolder {
        @Bind(R.id.short_season_tv_season_card) TextView shortSeason;
        @Bind(R.id.season_tv_season_card) TextView seasonTextView;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}

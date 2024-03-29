package com.antonio.f1nfo.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.antonio.f1nfo.R;
import com.antonio.f1nfo.models.Session;
import com.antonio.f1nfo.presenters.SessionsPresenter;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by antonio on 2/9/16.
 */
public class SessionsRecyclerAdapter extends RecyclerView.Adapter<SessionsRecyclerAdapter.ViewHolder> {
    private List<Session> sessions;
    private SessionsPresenter presenter;


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.round_num_session_card)
        TextView roundNum;
        @Bind(R.id.race_name_session_card)
        TextView raceName;
        @Bind(R.id.circut_name_session_card)
        TextView circutName;
        @Bind(R.id.date_session_card)
        TextView date;

        // each data item is just a string in this case
        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

        // Provide a suitable constructor (depends on the kind of dataset)
        public SessionsRecyclerAdapter(List<Session> sessions, SessionsPresenter presenter) {
            this.sessions = sessions;
            this.presenter = presenter;
        }

        // Create new views (invoked by the layout manager)
        @Override
        public SessionsRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            // create a new view
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.session_item, parent, false);

            ViewHolder vh = new ViewHolder(v);
            return vh;
        }

        // Replace the contents of a view (invoked by the layout manager)
        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            // - get element from your dataset at this position
            // - replace the contents of the view with that element
            final Session session = sessions.get(position);

            holder.roundNum.setText("Round: " + session.getRound());
            holder.raceName.setText(session.getRaceName());
            holder.circutName.setText(session.getCircuit().getCircuitName());
            holder.date.setText(session.getDate());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    presenter.onItemClick(session);
                }
            });
        }

        // Return the size of your dataset (invoked by the layout manager)
        @Override
        public int getItemCount() {
            return sessions.size();
        }
    }
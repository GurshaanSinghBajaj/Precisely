package com.pankaj.maukascholars.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pankaj.maukascholars.R;
import com.pankaj.maukascholars.fragments.StarredFragment;

import java.util.List;

public class StarredEventsAdapter extends RecyclerView.Adapter<StarredEventsAdapter.ViewHolder> {

    private final List<com.pankaj.maukascholars.util.EventDetails> mValues;
    private final StarredFragment.OnListFragmentInteractionListener mListener;

    public StarredEventsAdapter(List<com.pankaj.maukascholars.util.EventDetails> items, StarredFragment.OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_profile_event, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.title.setText(mValues.get(position).getTitle());
        holder.description.setText(mValues.get(position).getDescription());
        holder.deadline.setText(mValues.get(position).getDeadline());
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        final View mView;
        final TextView title;
        final TextView description;
        final TextView deadline;
        com.pankaj.maukascholars.util.EventDetails mItem;

        ViewHolder(View view) {
            super(view);
            mView = view;
            title =  view.findViewById(R.id.title);
            description = view.findViewById(R.id.description);
            deadline = view.findViewById(R.id.deadline);
        }
    }
}


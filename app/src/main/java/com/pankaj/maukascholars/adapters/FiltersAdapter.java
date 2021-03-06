package com.pankaj.maukascholars.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pankaj.maukascholars.R;
import com.pankaj.maukascholars.holders.FiltersViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pankaj on 11/11/17.
 *
 */

public class FiltersAdapter extends RecyclerView.Adapter<FiltersViewHolder> {

    private List<String> FILTER_IDS = new ArrayList<>();
    public FiltersViewHolder fvH;

    private Context mContext;
    public FiltersAdapter(Context context, List<String> FILTER_IDS) {
        this.FILTER_IDS = FILTER_IDS;
        mContext = context;
    }

    @Override
    public FiltersViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.item_filter, parent, false);
        fvH = new FiltersViewHolder(view);
        return fvH;

    }

    @Override
    public void onBindViewHolder(final FiltersViewHolder holder, final int position) {
        holder.bindTo(FILTER_IDS.get(position), position);
    }

    @Override
    public int getItemCount() {
        return FILTER_IDS.size();
    }
}
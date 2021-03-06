package com.pankaj.maukascholars.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.pankaj.maukascholars.R;
import com.google.android.flexbox.FlexboxLayoutManager;

import static com.pankaj.maukascholars.util.Constants.clickedFilters;

/**
 * Created by pankaj on 11/11/17.
 */

public class FiltersViewHolder extends RecyclerView.ViewHolder {

    private Button filter_button;

    public FiltersViewHolder(View itemView) {
        super(itemView);
        filter_button = itemView.findViewById(R.id.filter_button);
        filter_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clickedFilters.contains(getAdapterPosition())){
                    clickedFilters.remove(Integer.valueOf(getAdapterPosition()));
                    filter_button.setBackgroundColor(0xFFFFFFFF);
                    filter_button.setTextColor(0xFF000000);
                }else{
                    clickedFilters.add(getAdapterPosition());
                    filter_button.setBackgroundColor(0xFF000000);
                    filter_button.setTextColor(0xFFFFFFFF);
                }
            }
        });

        filter_button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                return false;
            }
        });
    }

    public void bindTo(String filter, int position) {
        if (clickedFilters.contains(position)){
            filter_button.setBackgroundColor(0xFF000000);
            filter_button.setTextColor(0xFFFFFFFF);
        }

        filter_button.setText(filter);
        ViewGroup.LayoutParams lp = filter_button.getLayoutParams();
        if (lp instanceof FlexboxLayoutManager.LayoutParams) {
            FlexboxLayoutManager.LayoutParams flexboxLp = (FlexboxLayoutManager.LayoutParams) lp;
            flexboxLp.setFlexGrow(1.0f);
        }
    }
}

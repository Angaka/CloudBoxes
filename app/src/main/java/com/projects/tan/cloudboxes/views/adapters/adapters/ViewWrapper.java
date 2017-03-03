package com.projects.tan.cloudboxes.views.adapters.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by oudong on 03/03/2017.
 */

public class ViewWrapper<V extends View> extends RecyclerView.ViewHolder {

    private V view;

    public ViewWrapper(V itemView) {
        super(itemView);
        view = itemView;
    }


    public V getView() {
        return view;
    }
}

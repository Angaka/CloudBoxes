package com.projects.tan.cloudboxes.views.adapters.items;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.projects.tan.cloudboxes.R;
import com.projects.tan.cloudboxes.models.Cloud;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

/**
 * Created by oudong on 03/03/2017.
 */

@EViewGroup(R.layout.item_cloud)
public class CloudItemView extends LinearLayout {

    @ViewById
    protected ImageView mImageViewCloud;
    @ViewById
    protected TextView mTextViewCloud;

    public CloudItemView(Context context) {
        super(context);
    }

    public void bind(Cloud cloud) {
        mImageViewCloud.setImageResource(cloud.getIcon());
        mTextViewCloud.setText(cloud.getName());
    }
}

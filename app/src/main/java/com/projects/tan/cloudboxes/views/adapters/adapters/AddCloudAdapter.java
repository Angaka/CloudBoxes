package com.projects.tan.cloudboxes.views.adapters.adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.projects.tan.cloudboxes.R;
import com.projects.tan.cloudboxes.models.Cloud;
import com.projects.tan.cloudboxes.models.CloudFinder;
import com.projects.tan.cloudboxes.networks.services.DropBoxService;
import com.projects.tan.cloudboxes.views.adapters.items.CloudItemView;
import com.projects.tan.cloudboxes.views.adapters.items.CloudItemView_;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oudong on 02/03/2017.
 */
@EBean
public class AddCloudAdapter extends BaseAdapter {

    List<Cloud> clouds;

    @RootContext
    Context context;

    @Override
    public int getCount() {
        return clouds.size();
    }

    @AfterInject
    protected void initAdapter() {
        clouds = new ArrayList<>();
        clouds.add(new Cloud(context.getString(R.string.dropbox), R.drawable.ic_dropbox, new DropBoxService()));
        clouds.add(new Cloud(context.getString(R.string.google_drive), R.drawable.ic_google_drive, new DropBoxService()));
    }

    @Override
    public Cloud getItem(int position) {
        return clouds.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CloudItemView cloudItemView;

        if (convertView == null)
            cloudItemView = CloudItemView_.build(context);
        else
            cloudItemView = (CloudItemView) convertView;
        cloudItemView.bind(getItem(position));

        return cloudItemView;
    }
}

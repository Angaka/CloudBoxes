package com.projects.tan.cloudboxes.activities;

import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.projects.tan.cloudboxes.R;
import com.projects.tan.cloudboxes.models.Cloud;
import com.projects.tan.cloudboxes.views.adapters.adapters.AddCloudAdapter;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ViewById;

/**
 * Created by oudong on 02/03/2017.
 */
@EActivity(R.layout.activity_add_cloud)
public class AddCloudActivity extends BaseToolbarActivity {

    @ViewById
    protected ListView mListViewAddCloud;

    @Bean
    protected AddCloudAdapter adapter;

    @AfterViews
    protected void initViews() {
        initToolbarBack();
    }

    @AfterViews
    protected void bindAdapter() {
        mListViewAddCloud.setAdapter(adapter);
    }

    @ItemClick
    protected void mListViewAddCloudItemClicked(Cloud cloud) {

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

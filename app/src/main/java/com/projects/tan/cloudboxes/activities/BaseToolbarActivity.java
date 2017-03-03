package com.projects.tan.cloudboxes.activities;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by oudong on 17/02/2017.
 */
@EActivity
public abstract class BaseToolbarActivity extends AppCompatActivity {

    @ViewById
    protected Toolbar mToolbar;

    protected void initToolbar() {
        if (mToolbar != null) {
            setSupportActionBar(mToolbar);
        }
    }

    protected void initToolbarBack() {
        if (mToolbar != null) {
            setSupportActionBar(mToolbar);
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        }
    }
}

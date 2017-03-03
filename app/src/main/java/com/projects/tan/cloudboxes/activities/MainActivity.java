package com.projects.tan.cloudboxes.activities;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;

import com.projects.tan.cloudboxes.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends BaseToolbarActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static final int ADD_CLOUD = 0;

    @ViewById
    protected DrawerLayout mDrawerLayout;
    @ViewById
    protected NavigationView mNavigationView;


    @AfterViews
    protected void initViews() {
        initToolbar();
        initNavigationView();
    }

    private void initNavigationView() {
        mNavigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_navigation_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Fragment fragment = new Fragment();
        switch (id) {
            case R.id.mNavAddCloud:
                AddCloudActivity_.intent(this).startForResult(ADD_CLOUD);
                break;

            default:
                break;
        }

        if (fragment != null)
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.mContentMain, fragment)
                    .commit();
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}

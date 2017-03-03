package com.projects.tan.cloudboxes.networks.services;

import android.content.Context;
import android.content.SharedPreferences;

import com.dropbox.core.android.Auth;

import org.androidannotations.annotations.RootContext;

/**
 * Created by oudong on 03/03/2017.
 */

public abstract class BaseService {

    protected String serviceName;
    private String accessToken;

    @RootContext
    Context context;

    abstract public void initPreferences();
    abstract public void initAndLoadData(String accessToken);

    protected String getServiceName() {
        return serviceName;
    }

    protected String getAccessToken() {
        return accessToken;
    }
}

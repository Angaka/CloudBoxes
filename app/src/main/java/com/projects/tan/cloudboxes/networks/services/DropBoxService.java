package com.projects.tan.cloudboxes.networks.services;

import android.content.SharedPreferences;

import com.dropbox.core.DbxAppInfo;
import com.projects.tan.cloudboxes.R;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by oudong on 10/02/2017.
 */
public class DropBoxService {

    private static final String baseUrl = "https://api.dropboxapi.com/";

    public DropBoxService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

    @POST("oauth2/authorize")
    private void authorize() {
    }
}

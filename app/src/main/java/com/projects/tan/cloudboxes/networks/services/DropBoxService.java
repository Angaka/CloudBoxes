package com.projects.tan.cloudboxes.networks.services;

import android.content.Context;
import android.content.SharedPreferences;

import com.dropbox.core.DbxAppInfo;
import com.dropbox.core.android.Auth;
import com.projects.tan.cloudboxes.R;
import com.projects.tan.cloudboxes.networks.api.dropbox.DropBoxAPI;
import com.projects.tan.cloudboxes.networks.api.dropbox.User;

import org.androidannotations.annotations.RootContext;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by oudong on 10/02/2017.
 */
public class DropBoxService extends BaseService {

    private static final String baseUrl = "https://api.dropboxapi.com/";
    private DropBoxAPI dropBoxAPI;
    private User user;

    public DropBoxService() {
        super();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        dropBoxAPI = retrofit.create(DropBoxAPI.class);
    }

    public void getAccount() {
        Call<User> account = dropBoxAPI.getAccount();

        account.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                setUser(response.body());
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
    }

    @Override
    public void initPreferences() {
        SharedPreferences preferences = context.getSharedPreferences(context.getString(R.string.dropbox), Context.MODE_PRIVATE);
        String accessToken = preferences.getString("access-token", null);
        if (accessToken == null) {
            accessToken = Auth.getOAuth2Token();
            if (accessToken != null) {
                preferences.edit().putString("access-token", accessToken).apply();
                initAndLoadData(accessToken);
            }
        } else
            initAndLoadData(accessToken);

    }

    @Override
    public void initAndLoadData(String accessToken) {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

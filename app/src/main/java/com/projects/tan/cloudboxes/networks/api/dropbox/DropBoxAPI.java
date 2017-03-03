package com.projects.tan.cloudboxes.networks.api.dropbox;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by oudong on 03/03/2017.
 */

public interface DropBoxAPI {

    static final String baseUrl = "https://api.dropboxapi.com/";

    @POST("oauth2/authorize")
    void authorize(
        @Query("response_type") String responseType,
        @Query("client_id") String clientId);

    @GET("users/get_account")
    Call<User> getAccount();
}

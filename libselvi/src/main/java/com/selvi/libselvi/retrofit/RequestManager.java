package com.selvi.libselvi.retrofit;

import android.content.Context;

import com.selvi.libselvi.model.Basev2;

import retrofit2.Call;

/**
 * Created by selv on 24/05/2019.
 */
public class RequestManager {
    public static Call<Basev2> getNews(final Context context, final CallbackInterface callback, final String deviceId, final String communityId, final String data, int requestId) {
        Call<Basev2> getNews = ApiClient.createRequest(context).getAllNews(deviceId, communityId, data);
        getNews.enqueue(new ApiRequest(context, "200", callback, requestId));
        return getNews;
    }

    public enum RequestFailureType {SERVICE_FAILURE, HTTP_FAILURE, NETWORK_FAILURE}
}


package com.selvi.libselvi.retrofit;


import com.selvi.libselvi.model.Basev2;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by selv on 07/05/2019.
 */
public interface ApiInterface {

    @FormUrlEncoded
    @POST("v1/news/get-all")
    Call<Basev2> getAllNews(
            @Field("device_id") String device_id,
            @Field("community_id") String community_id,
            @Field("data") String data);
}

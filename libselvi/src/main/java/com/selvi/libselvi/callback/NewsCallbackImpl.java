package com.selvi.libselvi.callback;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.google.gson.Gson;
import com.selvi.libselvi.helper.FTAes;
import com.selvi.libselvi.helper.SecretKeyHelper;
import com.selvi.libselvi.model.AllNewsItem;
import com.selvi.libselvi.retrofit.CallbackInterface;
import com.selvi.libselvi.retrofit.RequestManager;

import static com.selvi.libselvi.helper.SecretKeyHelper.getDefaultKey;
import static com.selvi.libselvi.helper.SecretKeyHelper.getEncryptianKey;

/**
 * Created by selv on 24/05/2019.
 */
public class NewsCallbackImpl implements CallbackInterface, NewsUseCase{
    private NewsCallback listener;
    public String communityId;
    private Context context;
    public String deviceId ;

    public NewsCallbackImpl(Context context, NewsCallback listener) {
        this.context = context;
        this.listener = listener;
        deviceId = "355033100414236";
        communityId = "4";
    }

    @Override
    public void onRequestSuccess(int requestId, @Nullable String rawData) {
        Gson gson = new Gson();
        AllNewsItem newsitems = gson.fromJson(rawData, AllNewsItem.class);
        if (newsitems != null) {
            listener.onNewsSuccess(newsitems);
        }

    }

    @Override
    public void onRequestNotFound(int requestId) {

    }

    @Override
    public void onRequestFailure(int requestId, RequestManager.RequestFailureType failureType, String errorCode, String message) {
//        listener.onAddCardFailure(message);
    }

    @Override
    public void executeGetNewsAll(String keyword, String email, int page, int page_size, String type){
        String jsonData = "{\n" +
                " \"page\": \"" + page + "\",\n" +
                " \"page_size\": \"" + page_size + "\",\n" +
                " \"device_id\": \"" + deviceId + "\",\n" +
                " \"community_id\": \"" + communityId + "\",\n" +
                " \"type\": \"" + type + "\",\n" +
                " \"email\": \"" + email + "\",\n" +
                " \"keyword\": \"" + keyword + "\"\n" +
                "}";
        String data = FTAes.encrypt(jsonData, getEncryptianKey());
        RequestManager.getNews(context, new NewsCallbackImpl(context, listener), deviceId, communityId, data, 0);
    }
}

package com.selvi.libselvi.retrofit;

import android.support.annotation.Nullable;

/**
 * Created by selv on 24/05/2019.
 */
public interface CallbackInterface {

    void onRequestSuccess(int requestId, @Nullable String rawData);

    void onRequestNotFound(int requestId);

    void onRequestFailure(int requestId, RequestManager.RequestFailureType failureType, String errorCode, String message);
}

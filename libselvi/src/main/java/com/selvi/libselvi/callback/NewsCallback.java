package com.selvi.libselvi.callback;

import com.selvi.libselvi.model.AllNewsItem;

/**
 * Created by selv on 24/05/2019.
 */
public interface NewsCallback {

    void onNewsSuccess(AllNewsItem listData);

    void onNewsFailure(String message);

}

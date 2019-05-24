package com.selvi.libselvi.callback;

/**
 * Created by selv on 24/05/2019.
 */
public interface NewsUseCase {

    void executeGetNewsAll(String keyword, String email, int page, int page_size, String type) throws Exception;
}

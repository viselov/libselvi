package com.selvi.libselvi.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by selv on 15/06/2017.
 */

public class ListNewsItem implements Parcelable {
    @SerializedName("all")
    @Expose
    private List<NewsItem> all;

    @SerializedName("news")
    @Expose
    private List<NewsItem> news;

    @SerializedName("article")
    @Expose
    private List<NewsItem> article;

    protected ListNewsItem(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ListNewsItem> CREATOR = new Creator<ListNewsItem>() {
        @Override
        public ListNewsItem createFromParcel(Parcel in) {
            return new ListNewsItem(in);
        }

        @Override
        public ListNewsItem[] newArray(int size) {
            return new ListNewsItem[size];
        }
    };

    public List<NewsItem> getAll() {
        return all;
    }

    public void setAll(List<NewsItem> all) {
        this.all = all;
    }

    public List<NewsItem> getNews() {
        return news;
    }

    public void setNews(List<NewsItem> news) {
        this.news = news;
    }

    public List<NewsItem> getArticle() {
        return article;
    }

    public void setArticle(List<NewsItem> article) {
        this.article = article;
    }

    public static Creator<ListNewsItem> getCREATOR() {
        return CREATOR;
    }
}

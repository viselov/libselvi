package com.selvi.libselvi.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by selv on 15/06/2017.
 */

public class AllNewsItem implements Parcelable {

    @SerializedName("list")
    @Expose
    private ListNewsItem list;

    protected AllNewsItem(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<AllNewsItem> CREATOR = new Creator<AllNewsItem>() {
        @Override
        public AllNewsItem createFromParcel(Parcel in) {
            return new AllNewsItem(in);
        }

        @Override
        public AllNewsItem[] newArray(int size) {
            return new AllNewsItem[size];
        }
    };

    public ListNewsItem getList() {
        return list;
    }

    public void setList(ListNewsItem list) {
        this.list = list;
    }

    public static Creator<AllNewsItem> getCREATOR() {
        return CREATOR;
    }
}



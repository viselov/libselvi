package com.selvi.libselvi.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by selv on 15/06/2017.
 */

public class NewsItem implements Parcelable
{

    @SerializedName("news_id")
    @Expose
    private String newsId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("short_description")
    @Expose
    private String shortDescription;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("additional_file_url")
    @Expose
    private String additional_file_url;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("created_date")
    @Expose
    private String createdDate;
    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("like_count")
    @Expose
    private String likeCount;
    @SerializedName("comment_count")
    @Expose
    private String commentCount;
    @SerializedName("is_liked")
    @Expose
    private String isLiked;

    @SerializedName("is_headline")
    @Expose
    private String isHeadline;
    public final static Parcelable.Creator<NewsItem> CREATOR = new Creator<NewsItem>() {


        @SuppressWarnings({
                "unchecked"
        })
        public NewsItem createFromParcel(Parcel in) {
            return new NewsItem(in);
        }

        public NewsItem[] newArray(int size) {
            return (new NewsItem[size]);
        }

    }
            ;

    protected NewsItem(Parcel in) {
        this.newsId = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.author = ((String) in.readValue((String.class.getClassLoader())));
        this.shortDescription = ((String) in.readValue((String.class.getClassLoader())));
        this.imageUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.additional_file_url = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.createdDate = ((String) in.readValue((String.class.getClassLoader())));
        this.categoryId = ((String) in.readValue((String.class.getClassLoader())));
        this.likeCount = ((String) in.readValue((String.class.getClassLoader())));
        this.commentCount = ((String) in.readValue((String.class.getClassLoader())));
        this.isLiked = ((String) in.readValue((String.class.getClassLoader())));
        this.isHeadline = ((String) in.readValue((String.class.getClassLoader())));
    }

    public NewsItem() {
    }

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public void setAdditional_file_url(String additional_file_url) {
        this.additional_file_url = additional_file_url;
    }

    public String getAdditional_file_url() {
        return additional_file_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(String likeCount) {
        this.likeCount = likeCount;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getIsLiked() {
        return isLiked;
    }

    public void setIsLiked(String isLiked) {
        this.isLiked = isLiked;
    }

    public String getIsHeadline() {
        return isHeadline;
    }

    public void setIsHeadline(String isHeadline) {
        this.isHeadline = isHeadline;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(newsId);
        dest.writeValue(title);
        dest.writeValue(author);
        dest.writeValue(shortDescription);
        dest.writeValue(imageUrl);
        dest.writeValue(additional_file_url);
        dest.writeValue(type);
        dest.writeValue(createdDate);
        dest.writeValue(categoryId);
        dest.writeValue(likeCount);
        dest.writeValue(commentCount);
        dest.writeValue(isLiked);
        dest.writeValue(isHeadline);
    }

    public int describeContents() {
        return 0;
    }

}
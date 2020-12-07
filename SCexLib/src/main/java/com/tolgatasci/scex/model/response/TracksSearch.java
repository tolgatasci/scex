package com.tolgatasci.scex.model.response;

import com.google.gson.annotations.SerializedName;

public class TracksSearch {
    @SerializedName("artwork_url")
    private String artwork_url;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;
    @SerializedName("created_at")
    private String created_at;
    @SerializedName("duration")
    private String duration;
    @SerializedName("id")
    private int id;
    @SerializedName("user_id")
    private int user_id;


}


package com.tolgatasci.scex.model.response;


import com.google.gson.annotations.SerializedName;


public class Transcoding {

    @SerializedName("duration")
    private Long mDuration;
    @SerializedName("format")
    private Format mFormat;
    @SerializedName("preset")
    private String mPreset;
    @SerializedName("quality")
    private String mQuality;
    @SerializedName("snipped")
    private Boolean mSnipped;
    @SerializedName("url")
    private String mUrl;

    public Long getDuration() {
        return mDuration;
    }

    public void setDuration(Long duration) {
        mDuration = duration;
    }

    public Format getFormat() {
        return mFormat;
    }

    public void setFormat(Format format) {
        mFormat = format;
    }

    public String getPreset() {
        return mPreset;
    }

    public void setPreset(String preset) {
        mPreset = preset;
    }

    public String getQuality() {
        return mQuality;
    }

    public void setQuality(String quality) {
        mQuality = quality;
    }

    public Boolean getSnipped() {
        return mSnipped;
    }

    public void setSnipped(Boolean snipped) {
        mSnipped = snipped;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

}

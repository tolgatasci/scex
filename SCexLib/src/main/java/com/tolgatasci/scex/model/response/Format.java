
package com.tolgatasci.scex.model.response;

import com.google.gson.annotations.SerializedName;


public class Format {

    @SerializedName("mime_type")
    private String mMimeType;
    @SerializedName("protocol")
    private String mProtocol;

    public String getMimeType() {
        return mMimeType;
    }

    public void setMimeType(String mimeType) {
        mMimeType = mimeType;
    }

    public String getProtocol() {
        return mProtocol;
    }

    public void setProtocol(String protocol) {
        mProtocol = protocol;
    }

}

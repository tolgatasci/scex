
package com.tolgatasci.scex.model.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;


public class Media {

    @SerializedName("transcodings")
    private List<Transcoding> mTranscodings;

    public List<Transcoding> getTranscodings() {
        return mTranscodings;
    }

    public void setTranscodings(List<Transcoding> transcodings) {
        mTranscodings = transcodings;
    }

}

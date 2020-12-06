
package com.tolgatasci.scex.model.response;

import com.google.gson.annotations.SerializedName;


public class Product {

    @SerializedName("id")
    private String mId;

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

}

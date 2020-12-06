
package com.tolgatasci.scex.model.response;

import com.google.gson.annotations.SerializedName;

public class Badges {

    @SerializedName("pro")
    private Boolean mPro;
    @SerializedName("pro_unlimited")
    private Boolean mProUnlimited;
    @SerializedName("verified")
    private Boolean mVerified;

    public Boolean getPro() {
        return mPro;
    }

    public void setPro(Boolean pro) {
        mPro = pro;
    }

    public Boolean getProUnlimited() {
        return mProUnlimited;
    }

    public void setProUnlimited(Boolean proUnlimited) {
        mProUnlimited = proUnlimited;
    }

    public Boolean getVerified() {
        return mVerified;
    }

    public void setVerified(Boolean verified) {
        mVerified = verified;
    }

}

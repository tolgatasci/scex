
package com.tolgatasci.scex.model.response;

import com.google.gson.annotations.SerializedName;


public class CreatorSubscription {

    @SerializedName("product")
    private Product mProduct;

    public Product getProduct() {
        return mProduct;
    }

    public void setProduct(Product product) {
        mProduct = product;
    }

}

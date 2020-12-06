package com.tolgatasci.scex.model.response.seach;

import com.google.gson.annotations.SerializedName;

public class CreatorSubscriptionsItem{

	@SerializedName("product")
	private Product product;

	public Product getProduct(){
		return product;
	}
}
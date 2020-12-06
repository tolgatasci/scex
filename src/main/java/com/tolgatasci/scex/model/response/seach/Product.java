package com.tolgatasci.scex.model.response.seach;

import com.google.gson.annotations.SerializedName;

public class Product{

	@SerializedName("id")
	private String id;

	public String getId(){
		return id;
	}
}
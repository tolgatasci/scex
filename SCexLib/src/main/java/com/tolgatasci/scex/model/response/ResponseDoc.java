package com.tolgatasci.scex.model.response;

import com.google.gson.annotations.SerializedName;

public class ResponseDoc {

	@SerializedName("url")
	private String url;

	public String getUrl(){
		return url;
	}
}
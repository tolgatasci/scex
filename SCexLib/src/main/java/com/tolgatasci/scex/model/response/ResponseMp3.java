package com.tolgatasci.scex.model.response;

import com.google.gson.annotations.SerializedName;

public class ResponseMp3{

	@SerializedName("url")
	private String url;

	public String getUrl(){
		return url;
	}
}
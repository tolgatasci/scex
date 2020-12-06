package com.tolgatasci.scex.model.response.seach;

import com.google.gson.annotations.SerializedName;

public class Format{

	@SerializedName("protocol")
	private String protocol;

	@SerializedName("mime_type")
	private String mimeType;

	public String getProtocol(){
		return protocol;
	}

	public String getMimeType(){
		return mimeType;
	}
}
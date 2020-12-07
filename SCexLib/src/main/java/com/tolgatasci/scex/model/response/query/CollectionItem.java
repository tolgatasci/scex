package com.tolgatasci.scex.model.response.query;

import com.google.gson.annotations.SerializedName;

public class CollectionItem{

	@SerializedName("output")
	private String output;

	@SerializedName("query")
	private String query;

	public String getOutput(){
		return output;
	}

	public String getQuery(){
		return query;
	}
}
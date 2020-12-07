package com.tolgatasci.scex.model.response.query;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseQuery{

	@SerializedName("query_urn")
	private String queryUrn;

	@SerializedName("collection")
	private List<CollectionItem> collection;

	@SerializedName("next_href")
	private Object nextHref;

	public String getQueryUrn(){
		return queryUrn;
	}

	public List<CollectionItem> getCollection(){
		return collection;
	}

	public Object getNextHref(){
		return nextHref;
	}
}
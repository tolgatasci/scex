package com.tolgatasci.scex.model.response.seach;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseAlbum{

	@SerializedName("query_urn")
	private String queryUrn;

	@SerializedName("collection")
	private List<CollectionItem> collection;

	@SerializedName("total_results")
	private int totalResults;

	@SerializedName("facets")
	private List<FacetsItem> facets;

	@SerializedName("next_href")
	private String nextHref;

	public String getQueryUrn(){
		return queryUrn;
	}

	public List<CollectionItem> getCollection(){
		return collection;
	}

	public int getTotalResults(){
		return totalResults;
	}

	public List<FacetsItem> getFacets(){
		return facets;
	}

	public String getNextHref(){
		return nextHref;
	}
}
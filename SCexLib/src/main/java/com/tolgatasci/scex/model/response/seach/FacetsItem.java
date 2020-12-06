package com.tolgatasci.scex.model.response.seach;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class FacetsItem{

	@SerializedName("name")
	private String name;

	@SerializedName("facets")
	private List<FacetsItem> facets;

	@SerializedName("filter")
	private String filter;

	@SerializedName("count")
	private int count;

	@SerializedName("value")
	private String value;

	public String getName(){
		return name;
	}

	public List<FacetsItem> getFacets(){
		return facets;
	}

	public String getFilter(){
		return filter;
	}

	public int getCount(){
		return count;
	}

	public String getValue(){
		return value;
	}
}
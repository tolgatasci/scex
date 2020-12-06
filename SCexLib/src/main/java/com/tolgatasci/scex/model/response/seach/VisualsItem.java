package com.tolgatasci.scex.model.response.seach;

import com.google.gson.annotations.SerializedName;

public class VisualsItem{

	@SerializedName("urn")
	private String urn;

	@SerializedName("visual_url")
	private String visualUrl;

	@SerializedName("entry_time")
	private int entryTime;

	public String getUrn(){
		return urn;
	}

	public String getVisualUrl(){
		return visualUrl;
	}

	public int getEntryTime(){
		return entryTime;
	}
}
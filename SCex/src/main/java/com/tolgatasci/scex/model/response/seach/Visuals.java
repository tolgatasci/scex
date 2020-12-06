package com.tolgatasci.scex.model.response.seach;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Visuals{

	@SerializedName("urn")
	private String urn;

	@SerializedName("visuals")
	private List<VisualsItem> visuals;

	@SerializedName("tracking")
	private Object tracking;

	@SerializedName("enabled")
	private boolean enabled;

	public String getUrn(){
		return urn;
	}

	public List<VisualsItem> getVisuals(){
		return visuals;
	}

	public Object getTracking(){
		return tracking;
	}

	public boolean isEnabled(){
		return enabled;
	}
}
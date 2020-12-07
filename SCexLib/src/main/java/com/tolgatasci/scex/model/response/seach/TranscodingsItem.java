package com.tolgatasci.scex.model.response.seach;

import com.google.gson.annotations.SerializedName;

public class TranscodingsItem{

	@SerializedName("duration")
	private int duration;

	@SerializedName("snipped")
	private boolean snipped;

	@SerializedName("format")
	private Format format;

	@SerializedName("preset")
	private String preset;

	@SerializedName("url")
	private String url;

	@SerializedName("quality")
	private String quality;

	public int getDuration(){
		return duration;
	}

	public boolean isSnipped(){
		return snipped;
	}

	public Format getFormat(){
		return format;
	}

	public String getPreset(){
		return preset;
	}

	public String getUrl(){
		return url;
	}

	public String getQuality(){
		return quality;
	}
}
package com.tolgatasci.scex.model.response.seach;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Media{

	@SerializedName("transcodings")
	private List<TranscodingsItem> transcodings;

	public List<TranscodingsItem> getTranscodings(){
		return transcodings;
	}
}
package com.tolgatasci.scex.model.response.playlist;

import com.google.gson.annotations.SerializedName;

public class Badges{

	@SerializedName("verified")
	private boolean verified;

	@SerializedName("pro")
	private boolean pro;

	@SerializedName("pro_unlimited")
	private boolean proUnlimited;

	public boolean isVerified(){
		return verified;
	}

	public boolean isPro(){
		return pro;
	}

	public boolean isProUnlimited(){
		return proUnlimited;
	}
}
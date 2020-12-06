package com.tolgatasci.scex.model.response.playlist;

import com.google.gson.annotations.SerializedName;

public class User{

	@SerializedName("city")
	private Object city;

	@SerializedName("kind")
	private String kind;

	@SerializedName("verified")
	private boolean verified;

	@SerializedName("last_name")
	private String lastName;

	@SerializedName("uri")
	private String uri;

	@SerializedName("urn")
	private String urn;

	@SerializedName("badges")
	private Badges badges;

	@SerializedName("country_code")
	private Object countryCode;

	@SerializedName("full_name")
	private String fullName;

	@SerializedName("avatar_url")
	private String avatarUrl;

	@SerializedName("id")
	private int id;

	@SerializedName("permalink")
	private String permalink;

	@SerializedName("permalink_url")
	private String permalinkUrl;

	@SerializedName("first_name")
	private String firstName;

	@SerializedName("last_modified")
	private String lastModified;

	@SerializedName("username")
	private String username;

	public Object getCity(){
		return city;
	}

	public String getKind(){
		return kind;
	}

	public boolean isVerified(){
		return verified;
	}

	public String getLastName(){
		return lastName;
	}

	public String getUri(){
		return uri;
	}

	public String getUrn(){
		return urn;
	}

	public Badges getBadges(){
		return badges;
	}

	public Object getCountryCode(){
		return countryCode;
	}

	public String getFullName(){
		return fullName;
	}

	public String getAvatarUrl(){
		return avatarUrl;
	}

	public int getId(){
		return id;
	}

	public String getPermalink(){
		return permalink;
	}

	public String getPermalinkUrl(){
		return permalinkUrl;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getLastModified(){
		return lastModified;
	}

	public String getUsername(){
		return username;
	}
}
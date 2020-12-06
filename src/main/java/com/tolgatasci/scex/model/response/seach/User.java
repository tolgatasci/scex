package com.tolgatasci.scex.model.response.seach;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class User{

	@SerializedName("creator_subscriptions")
	private List<CreatorSubscriptionsItem> creatorSubscriptions;

	@SerializedName("city")
	private String city;

	@SerializedName("creator_subscription")
	private CreatorSubscription creatorSubscription;

	@SerializedName("groups_count")
	private int groupsCount;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("description")
	private String description;

	@SerializedName("track_count")
	private int trackCount;

	@SerializedName("id")
	private int id;

	@SerializedName("reposts_count")
	private Object repostsCount;

	@SerializedName("first_name")
	private String firstName;

	@SerializedName("last_modified")
	private String lastModified;

	@SerializedName("playlist_count")
	private int playlistCount;

	@SerializedName("visuals")
	private Visuals visuals;

	@SerializedName("kind")
	private String kind;

	@SerializedName("verified")
	private boolean verified;

	@SerializedName("last_name")
	private String lastName;

	@SerializedName("followings_count")
	private int followingsCount;

	@SerializedName("uri")
	private String uri;

	@SerializedName("playlist_likes_count")
	private int playlistLikesCount;

	@SerializedName("likes_count")
	private int likesCount;

	@SerializedName("urn")
	private String urn;

	@SerializedName("badges")
	private Badges badges;

	@SerializedName("country_code")
	private String countryCode;

	@SerializedName("full_name")
	private String fullName;

	@SerializedName("avatar_url")
	private String avatarUrl;

	@SerializedName("comments_count")
	private int commentsCount;

	@SerializedName("followers_count")
	private int followersCount;

	@SerializedName("permalink")
	private String permalink;

	@SerializedName("permalink_url")
	private String permalinkUrl;

	@SerializedName("username")
	private String username;

	public List<CreatorSubscriptionsItem> getCreatorSubscriptions(){
		return creatorSubscriptions;
	}

	public String getCity(){
		return city;
	}

	public CreatorSubscription getCreatorSubscription(){
		return creatorSubscription;
	}

	public int getGroupsCount(){
		return groupsCount;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public String getDescription(){
		return description;
	}

	public int getTrackCount(){
		return trackCount;
	}

	public int getId(){
		return id;
	}

	public Object getRepostsCount(){
		return repostsCount;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getLastModified(){
		return lastModified;
	}

	public int getPlaylistCount(){
		return playlistCount;
	}

	public Visuals getVisuals(){
		return visuals;
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

	public int getFollowingsCount(){
		return followingsCount;
	}

	public String getUri(){
		return uri;
	}

	public int getPlaylistLikesCount(){
		return playlistLikesCount;
	}

	public int getLikesCount(){
		return likesCount;
	}

	public String getUrn(){
		return urn;
	}

	public Badges getBadges(){
		return badges;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public String getFullName(){
		return fullName;
	}

	public String getAvatarUrl(){
		return avatarUrl;
	}

	public int getCommentsCount(){
		return commentsCount;
	}

	public int getFollowersCount(){
		return followersCount;
	}

	public String getPermalink(){
		return permalink;
	}

	public String getPermalinkUrl(){
		return permalinkUrl;
	}

	public String getUsername(){
		return username;
	}
}
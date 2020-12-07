package com.tolgatasci.scex.model.response.playlist;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponsePlaylist{

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("description")
	private Object description;

	@SerializedName("title")
	private String title;

	@SerializedName("track_count")
	private int trackCount;

	@SerializedName("duration")
	private int duration;

	@SerializedName("artwork_url")
	private Object artworkUrl;

	@SerializedName("public")
	private boolean jsonMemberPublic;

	@SerializedName("tag_list")
	private String tagList;

	@SerializedName("genre")
	private String genre;

	@SerializedName("id")
	private int id;

	@SerializedName("reposts_count")
	private int repostsCount;

	@SerializedName("published_at")
	private Object publishedAt;

	@SerializedName("label_name")
	private Object labelName;

	@SerializedName("last_modified")
	private String lastModified;

	@SerializedName("managed_by_feeds")
	private boolean managedByFeeds;

	@SerializedName("kind")
	private String kind;

	@SerializedName("purchase_url")
	private Object purchaseUrl;

	@SerializedName("set_type")
	private String setType;

	@SerializedName("sharing")
	private String sharing;

	@SerializedName("uri")
	private String uri;

	@SerializedName("secret_token")
	private Object secretToken;

	@SerializedName("tracks")
	private List<TracksItem> tracks;

	@SerializedName("likes_count")
	private int likesCount;

	@SerializedName("license")
	private String license;

	@SerializedName("purchase_title")
	private Object purchaseTitle;

	@SerializedName("display_date")
	private String displayDate;

	@SerializedName("embeddable_by")
	private String embeddableBy;

	@SerializedName("release_date")
	private Object releaseDate;

	@SerializedName("user_id")
	private int userId;

	@SerializedName("is_album")
	private boolean isAlbum;

	@SerializedName("permalink")
	private String permalink;

	@SerializedName("permalink_url")
	private String permalinkUrl;

	@SerializedName("user")
	private User user;

	public String getCreatedAt(){
		return createdAt;
	}

	public Object getDescription(){
		return description;
	}

	public String getTitle(){
		return title;
	}

	public int getTrackCount(){
		return trackCount;
	}

	public int getDuration(){
		return duration;
	}

	public Object getArtworkUrl(){
		return artworkUrl;
	}

	public boolean isJsonMemberPublic(){
		return jsonMemberPublic;
	}

	public String getTagList(){
		return tagList;
	}

	public String getGenre(){
		return genre;
	}

	public int getId(){
		return id;
	}

	public int getRepostsCount(){
		return repostsCount;
	}

	public Object getPublishedAt(){
		return publishedAt;
	}

	public Object getLabelName(){
		return labelName;
	}

	public String getLastModified(){
		return lastModified;
	}

	public boolean isManagedByFeeds(){
		return managedByFeeds;
	}

	public String getKind(){
		return kind;
	}

	public Object getPurchaseUrl(){
		return purchaseUrl;
	}

	public String getSetType(){
		return setType;
	}

	public String getSharing(){
		return sharing;
	}

	public String getUri(){
		return uri;
	}

	public Object getSecretToken(){
		return secretToken;
	}

	public List<TracksItem> getTracks(){
		return tracks;
	}

	public int getLikesCount(){
		return likesCount;
	}

	public String getLicense(){
		return license;
	}

	public Object getPurchaseTitle(){
		return purchaseTitle;
	}

	public String getDisplayDate(){
		return displayDate;
	}

	public String getEmbeddableBy(){
		return embeddableBy;
	}

	public Object getReleaseDate(){
		return releaseDate;
	}

	public int getUserId(){
		return userId;
	}

	public boolean isIsAlbum(){
		return isAlbum;
	}

	public String getPermalink(){
		return permalink;
	}

	public String getPermalinkUrl(){
		return permalinkUrl;
	}

	public User getUser(){
		return user;
	}
}
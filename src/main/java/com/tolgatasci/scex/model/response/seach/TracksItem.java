package com.tolgatasci.scex.model.response.seach;

import com.google.gson.annotations.SerializedName;

public class TracksItem{

	@SerializedName("comment_count")
	private int commentCount;

	@SerializedName("full_duration")
	private int fullDuration;

	@SerializedName("downloadable")
	private boolean downloadable;

	@SerializedName("caption")
	private Object caption;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("description")
	private Object description;

	@SerializedName("media")
	private Media media;

	@SerializedName("title")
	private String title;

	@SerializedName("publisher_metadata")
	private PublisherMetadata publisherMetadata;

	@SerializedName("duration")
	private int duration;

	@SerializedName("has_downloads_left")
	private boolean hasDownloadsLeft;

	@SerializedName("artwork_url")
	private String artworkUrl;

	@SerializedName("public")
	private boolean jsonMemberPublic;

	@SerializedName("streamable")
	private boolean streamable;

	@SerializedName("tag_list")
	private String tagList;

	@SerializedName("genre")
	private String genre;

	@SerializedName("id")
	private int id;

	@SerializedName("reposts_count")
	private int repostsCount;

	@SerializedName("state")
	private String state;

	@SerializedName("label_name")
	private String labelName;

	@SerializedName("last_modified")
	private String lastModified;

	@SerializedName("commentable")
	private boolean commentable;

	@SerializedName("policy")
	private String policy;

	@SerializedName("visuals")
	private Object visuals;

	@SerializedName("kind")
	private String kind;

	@SerializedName("purchase_url")
	private Object purchaseUrl;

	@SerializedName("sharing")
	private String sharing;

	@SerializedName("uri")
	private String uri;

	@SerializedName("secret_token")
	private Object secretToken;

	@SerializedName("download_count")
	private int downloadCount;

	@SerializedName("likes_count")
	private int likesCount;

	@SerializedName("urn")
	private String urn;

	@SerializedName("license")
	private String license;

	@SerializedName("purchase_title")
	private Object purchaseTitle;

	@SerializedName("display_date")
	private String displayDate;

	@SerializedName("embeddable_by")
	private String embeddableBy;

	@SerializedName("release_date")
	private String releaseDate;

	@SerializedName("user_id")
	private int userId;

	@SerializedName("monetization_model")
	private String monetizationModel;

	@SerializedName("waveform_url")
	private String waveformUrl;

	@SerializedName("permalink")
	private String permalink;

	@SerializedName("permalink_url")
	private String permalinkUrl;

	@SerializedName("user")
	private User user;

	@SerializedName("playback_count")
	private int playbackCount;

	public int getCommentCount(){
		return commentCount;
	}

	public int getFullDuration(){
		return fullDuration;
	}

	public boolean isDownloadable(){
		return downloadable;
	}

	public Object getCaption(){
		return caption;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public Object getDescription(){
		return description;
	}

	public Media getMedia(){
		return media;
	}

	public String getTitle(){
		return title;
	}

	public PublisherMetadata getPublisherMetadata(){
		return publisherMetadata;
	}

	public int getDuration(){
		return duration;
	}

	public boolean isHasDownloadsLeft(){
		return hasDownloadsLeft;
	}

	public String getArtworkUrl(){
		return artworkUrl;
	}

	public boolean isJsonMemberPublic(){
		return jsonMemberPublic;
	}

	public boolean isStreamable(){
		return streamable;
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

	public String getState(){
		return state;
	}

	public String getLabelName(){
		return labelName;
	}

	public String getLastModified(){
		return lastModified;
	}

	public boolean isCommentable(){
		return commentable;
	}

	public String getPolicy(){
		return policy;
	}

	public Object getVisuals(){
		return visuals;
	}

	public String getKind(){
		return kind;
	}

	public Object getPurchaseUrl(){
		return purchaseUrl;
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

	public int getDownloadCount(){
		return downloadCount;
	}

	public int getLikesCount(){
		return likesCount;
	}

	public String getUrn(){
		return urn;
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

	public String getReleaseDate(){
		return releaseDate;
	}

	public int getUserId(){
		return userId;
	}

	public String getMonetizationModel(){
		return monetizationModel;
	}

	public String getWaveformUrl(){
		return waveformUrl;
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

	public int getPlaybackCount(){
		return playbackCount;
	}
}
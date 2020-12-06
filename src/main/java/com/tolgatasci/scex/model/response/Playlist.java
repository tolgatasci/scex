package com.tolgatasci.scex.model.response;

import com.google.gson.annotations.SerializedName;
import com.tolgatasci.scex.model.response.playlist.TracksItem;

import java.util.List;

public class Playlist {
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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Object getArtworkUrl() {
        return artworkUrl;
    }

    public void setArtworkUrl(Object artworkUrl) {
        this.artworkUrl = artworkUrl;
    }

    public boolean isJsonMemberPublic() {
        return jsonMemberPublic;
    }

    public void setJsonMemberPublic(boolean jsonMemberPublic) {
        this.jsonMemberPublic = jsonMemberPublic;
    }

    public String getTagList() {
        return tagList;
    }

    public void setTagList(String tagList) {
        this.tagList = tagList;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRepostsCount() {
        return repostsCount;
    }

    public void setRepostsCount(int repostsCount) {
        this.repostsCount = repostsCount;
    }

    public Object getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Object publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Object getLabelName() {
        return labelName;
    }

    public void setLabelName(Object labelName) {
        this.labelName = labelName;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public boolean isManagedByFeeds() {
        return managedByFeeds;
    }

    public void setManagedByFeeds(boolean managedByFeeds) {
        this.managedByFeeds = managedByFeeds;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Object getPurchaseUrl() {
        return purchaseUrl;
    }

    public void setPurchaseUrl(Object purchaseUrl) {
        this.purchaseUrl = purchaseUrl;
    }

    public String getSetType() {
        return setType;
    }

    public void setSetType(String setType) {
        this.setType = setType;
    }

    public String getSharing() {
        return sharing;
    }

    public void setSharing(String sharing) {
        this.sharing = sharing;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Object getSecretToken() {
        return secretToken;
    }

    public void setSecretToken(Object secretToken) {
        this.secretToken = secretToken;
    }

    public List<TracksItem> getTracks() {
        return tracks;
    }

    public void setTracks(List<TracksItem> tracks) {
        this.tracks = tracks;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Object getPurchaseTitle() {
        return purchaseTitle;
    }

    public void setPurchaseTitle(Object purchaseTitle) {
        this.purchaseTitle = purchaseTitle;
    }

    public String getDisplayDate() {
        return displayDate;
    }

    public void setDisplayDate(String displayDate) {
        this.displayDate = displayDate;
    }

    public String getEmbeddableBy() {
        return embeddableBy;
    }

    public void setEmbeddableBy(String embeddableBy) {
        this.embeddableBy = embeddableBy;
    }

    public Object getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Object releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isAlbum() {
        return isAlbum;
    }

    public void setAlbum(boolean album) {
        isAlbum = album;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getPermalinkUrl() {
        return permalinkUrl;
    }

    public void setPermalinkUrl(String permalinkUrl) {
        this.permalinkUrl = permalinkUrl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "createdAt='" + createdAt + '\'' +
                ", description=" + description +
                ", title='" + title + '\'' +
                ", trackCount=" + trackCount +
                ", duration=" + duration +
                ", artworkUrl=" + artworkUrl +
                ", jsonMemberPublic=" + jsonMemberPublic +
                ", tagList='" + tagList + '\'' +
                ", genre='" + genre + '\'' +
                ", id=" + id +
                ", repostsCount=" + repostsCount +
                ", publishedAt=" + publishedAt +
                ", labelName=" + labelName +
                ", lastModified='" + lastModified + '\'' +
                ", managedByFeeds=" + managedByFeeds +
                ", kind='" + kind + '\'' +
                ", purchaseUrl=" + purchaseUrl +
                ", setType='" + setType + '\'' +
                ", sharing='" + sharing + '\'' +
                ", uri='" + uri + '\'' +
                ", secretToken=" + secretToken +
                ", tracks=" + tracks +
                ", likesCount=" + likesCount +
                ", license='" + license + '\'' +
                ", purchaseTitle=" + purchaseTitle +
                ", displayDate='" + displayDate + '\'' +
                ", embeddableBy='" + embeddableBy + '\'' +
                ", releaseDate=" + releaseDate +
                ", userId=" + userId +
                ", isAlbum=" + isAlbum +
                ", permalink='" + permalink + '\'' +
                ", permalinkUrl='" + permalinkUrl + '\'' +
                ", user=" + user +
                '}';
    }
}

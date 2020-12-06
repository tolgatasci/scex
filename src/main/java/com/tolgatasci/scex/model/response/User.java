
package com.tolgatasci.scex.model.response;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class User {

    @SerializedName("avatar_url")
    private String mAvatarUrl;
    @SerializedName("badges")
    private Badges mBadges;
    @SerializedName("city")
    private String mCity;
    @SerializedName("comments_count")
    private Long mCommentsCount;
    @SerializedName("country_code")
    private String mCountryCode;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("creator_subscription")
    private CreatorSubscription mCreatorSubscription;
    @SerializedName("creator_subscriptions")
    private List<CreatorSubscription> mCreatorSubscriptions;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("first_name")
    private String mFirstName;
    @SerializedName("followers_count")
    private Long mFollowersCount;
    @SerializedName("followings_count")
    private Long mFollowingsCount;
    @SerializedName("full_name")
    private String mFullName;
    @SerializedName("groups_count")
    private Long mGroupsCount;
    @SerializedName("id")
    private Long mId;
    @SerializedName("kind")
    private String mKind;
    @SerializedName("last_modified")
    private String mLastModified;
    @SerializedName("last_name")
    private String mLastName;
    @SerializedName("likes_count")
    private Long mLikesCount;
    @SerializedName("permalink")
    private String mPermalink;
    @SerializedName("permalink_url")
    private String mPermalinkUrl;
    @SerializedName("playlist_count")
    private Long mPlaylistCount;
    @SerializedName("playlist_likes_count")
    private Long mPlaylistLikesCount;
    @SerializedName("reposts_count")
    private Object mRepostsCount;
    @SerializedName("track_count")
    private Long mTrackCount;
    @SerializedName("uri")
    private String mUri;
    @SerializedName("urn")
    private String mUrn;
    @SerializedName("username")
    private String mUsername;
    @SerializedName("verified")
    private Boolean mVerified;
    @SerializedName("visuals")
    private Object mVisuals;

    public String getAvatarUrl() {
        return mAvatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        mAvatarUrl = avatarUrl;
    }

    public Badges getBadges() {
        return mBadges;
    }

    public void setBadges(Badges badges) {
        mBadges = badges;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public Long getCommentsCount() {
        return mCommentsCount;
    }

    public void setCommentsCount(Long commentsCount) {
        mCommentsCount = commentsCount;
    }

    public String getCountryCode() {
        return mCountryCode;
    }

    public void setCountryCode(String countryCode) {
        mCountryCode = countryCode;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    public CreatorSubscription getCreatorSubscription() {
        return mCreatorSubscription;
    }

    public void setCreatorSubscription(CreatorSubscription creatorSubscription) {
        mCreatorSubscription = creatorSubscription;
    }

    public List<CreatorSubscription> getCreatorSubscriptions() {
        return mCreatorSubscriptions;
    }

    public void setCreatorSubscriptions(List<CreatorSubscription> creatorSubscriptions) {
        mCreatorSubscriptions = creatorSubscriptions;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public Long getFollowersCount() {
        return mFollowersCount;
    }

    public void setFollowersCount(Long followersCount) {
        mFollowersCount = followersCount;
    }

    public Long getFollowingsCount() {
        return mFollowingsCount;
    }

    public void setFollowingsCount(Long followingsCount) {
        mFollowingsCount = followingsCount;
    }

    public String getFullName() {
        return mFullName;
    }

    public void setFullName(String fullName) {
        mFullName = fullName;
    }

    public Long getGroupsCount() {
        return mGroupsCount;
    }

    public void setGroupsCount(Long groupsCount) {
        mGroupsCount = groupsCount;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getKind() {
        return mKind;
    }

    public void setKind(String kind) {
        mKind = kind;
    }

    public String getLastModified() {
        return mLastModified;
    }

    public void setLastModified(String lastModified) {
        mLastModified = lastModified;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public Long getLikesCount() {
        return mLikesCount;
    }

    public void setLikesCount(Long likesCount) {
        mLikesCount = likesCount;
    }

    public String getPermalink() {
        return mPermalink;
    }

    public void setPermalink(String permalink) {
        mPermalink = permalink;
    }

    public String getPermalinkUrl() {
        return mPermalinkUrl;
    }

    public void setPermalinkUrl(String permalinkUrl) {
        mPermalinkUrl = permalinkUrl;
    }

    public Long getPlaylistCount() {
        return mPlaylistCount;
    }

    public void setPlaylistCount(Long playlistCount) {
        mPlaylistCount = playlistCount;
    }

    public Long getPlaylistLikesCount() {
        return mPlaylistLikesCount;
    }

    public void setPlaylistLikesCount(Long playlistLikesCount) {
        mPlaylistLikesCount = playlistLikesCount;
    }

    public Object getRepostsCount() {
        return mRepostsCount;
    }

    public void setRepostsCount(Object repostsCount) {
        mRepostsCount = repostsCount;
    }

    public Long getTrackCount() {
        return mTrackCount;
    }

    public void setTrackCount(Long trackCount) {
        mTrackCount = trackCount;
    }

    public String getUri() {
        return mUri;
    }

    public void setUri(String uri) {
        mUri = uri;
    }

    public String getUrn() {
        return mUrn;
    }

    public void setUrn(String urn) {
        mUrn = urn;
    }

    public String getUsername() {
        return mUsername;
    }

    public void setUsername(String username) {
        mUsername = username;
    }

    public Boolean getVerified() {
        return mVerified;
    }

    public void setVerified(Boolean verified) {
        mVerified = verified;
    }

    public Object getVisuals() {
        return mVisuals;
    }

    public void setVisuals(Object visuals) {
        mVisuals = visuals;
    }

}

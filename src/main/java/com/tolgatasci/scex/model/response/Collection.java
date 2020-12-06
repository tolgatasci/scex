
package com.tolgatasci.scex.model.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Collection {

    @SerializedName("artwork_url")
    private String mArtworkUrl;
    @SerializedName("caption")
    private Object mCaption;
    @SerializedName("comment_count")
    private Long mCommentCount;
    @SerializedName("commentable")
    private Boolean mCommentable;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("display_date")
    private String mDisplayDate;
    @SerializedName("download_count")
    private Long mDownloadCount;
    @SerializedName("downloadable")
    private Boolean mDownloadable;
    @SerializedName("duration")
    private Long mDuration;
    @SerializedName("embeddable_by")
    private String mEmbeddableBy;
    @SerializedName("full_duration")
    private Long mFullDuration;
    @SerializedName("genre")
    private String mGenre;
    @SerializedName("has_downloads_left")
    private Boolean mHasDownloadsLeft;
    @SerializedName("id")
    private Long mId;
    @SerializedName("kind")
    private String mKind;
    @SerializedName("label_name")
    private String mLabelName;
    @SerializedName("last_modified")
    private String mLastModified;
    @SerializedName("license")
    private String mLicense;
    @SerializedName("likes_count")
    private Long mLikesCount;
    @SerializedName("media")
    private Media mMedia;
    @SerializedName("monetization_model")
    private String mMonetizationModel;
    @SerializedName("permalink")
    private String mPermalink;
    @SerializedName("permalink_url")
    private String mPermalinkUrl;
    @SerializedName("playback_count")
    private Long mPlaybackCount;
    @SerializedName("policy")
    private String mPolicy;
    @SerializedName("public")
    private Boolean mPublic;
    @SerializedName("publisher_metadata")
    private Object mPublisherMetadata;
    @SerializedName("purchase_title")
    private Object mPurchaseTitle;
    @SerializedName("purchase_url")
    private Object mPurchaseUrl;
    @SerializedName("release_date")
    private Object mReleaseDate;
    @SerializedName("reposts_count")
    private Long mRepostsCount;
    @SerializedName("secret_token")
    private Object mSecretToken;
    @SerializedName("sharing")
    private String mSharing;
    @SerializedName("state")
    private String mState;
    @SerializedName("streamable")
    private Boolean mStreamable;
    @SerializedName("tag_list")
    private String mTagList;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("uri")
    private String mUri;
    @SerializedName("urn")
    private String mUrn;
    @SerializedName("user")
    private User mUser;
    @SerializedName("user_id")
    private Long mUserId;
    @SerializedName("visuals")
    private Object mVisuals;
    @SerializedName("waveform_url")
    private String mWaveformUrl;
    @SerializedName("tracks")
    private List<TrackItem> tracks;
    @SerializedName("track")
    private TrackItem track;
    @SerializedName("body")
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public TrackItem getTrack() {
        return track;
    }

    public void setTrack(TrackItem track) {
        this.track = track;
    }

    public List<TrackItem> getTracks() {
        return tracks;
    }

    public void setTracks(List<TrackItem> tracks) {
        this.tracks = tracks;
    }

    public String getArtworkUrl() {
        return mArtworkUrl;
    }

    public void setArtworkUrl(String artworkUrl) {
        mArtworkUrl = artworkUrl;
    }

    public Object getCaption() {
        return mCaption;
    }

    public void setCaption(Object caption) {
        mCaption = caption;
    }

    public Long getCommentCount() {
        return mCommentCount;
    }

    public void setCommentCount(Long commentCount) {
        mCommentCount = commentCount;
    }

    public Boolean getCommentable() {
        return mCommentable;
    }

    public void setCommentable(Boolean commentable) {
        mCommentable = commentable;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getDisplayDate() {
        return mDisplayDate;
    }

    public void setDisplayDate(String displayDate) {
        mDisplayDate = displayDate;
    }

    public Long getDownloadCount() {
        return mDownloadCount;
    }

    public void setDownloadCount(Long downloadCount) {
        mDownloadCount = downloadCount;
    }

    public Boolean getDownloadable() {
        return mDownloadable;
    }

    public void setDownloadable(Boolean downloadable) {
        mDownloadable = downloadable;
    }

    public Long getDuration() {
        return mDuration;
    }

    public void setDuration(Long duration) {
        mDuration = duration;
    }

    public String getEmbeddableBy() {
        return mEmbeddableBy;
    }

    public void setEmbeddableBy(String embeddableBy) {
        mEmbeddableBy = embeddableBy;
    }

    public Long getFullDuration() {
        return mFullDuration;
    }

    public void setFullDuration(Long fullDuration) {
        mFullDuration = fullDuration;
    }

    public String getGenre() {
        return mGenre;
    }

    public void setGenre(String genre) {
        mGenre = genre;
    }

    public Boolean getHasDownloadsLeft() {
        return mHasDownloadsLeft;
    }

    public void setHasDownloadsLeft(Boolean hasDownloadsLeft) {
        mHasDownloadsLeft = hasDownloadsLeft;
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

    public String getLabelName() {
        return mLabelName;
    }

    public void setLabelName(String labelName) {
        mLabelName = labelName;
    }

    public String getLastModified() {
        return mLastModified;
    }

    public void setLastModified(String lastModified) {
        mLastModified = lastModified;
    }

    public String getLicense() {
        return mLicense;
    }

    public void setLicense(String license) {
        mLicense = license;
    }

    public Long getLikesCount() {
        return mLikesCount;
    }

    public void setLikesCount(Long likesCount) {
        mLikesCount = likesCount;
    }

    public Media getMedia() {
        return mMedia;
    }

    public void setMedia(Media media) {
        mMedia = media;
    }

    public String getMonetizationModel() {
        return mMonetizationModel;
    }

    public void setMonetizationModel(String monetizationModel) {
        mMonetizationModel = monetizationModel;
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

    public Long getPlaybackCount() {
        return mPlaybackCount;
    }

    public void setPlaybackCount(Long playbackCount) {
        mPlaybackCount = playbackCount;
    }

    public String getPolicy() {
        return mPolicy;
    }

    public void setPolicy(String policy) {
        mPolicy = policy;
    }

    public Boolean getPublic() {
        return mPublic;
    }

    public void setPublic(Boolean public_) {
        mPublic = public_;
    }

    public Object getPublisherMetadata() {
        return mPublisherMetadata;
    }

    public void setPublisherMetadata(Object publisherMetadata) {
        mPublisherMetadata = publisherMetadata;
    }

    public Object getPurchaseTitle() {
        return mPurchaseTitle;
    }

    public void setPurchaseTitle(Object purchaseTitle) {
        mPurchaseTitle = purchaseTitle;
    }

    public Object getPurchaseUrl() {
        return mPurchaseUrl;
    }

    public void setPurchaseUrl(Object purchaseUrl) {
        mPurchaseUrl = purchaseUrl;
    }

    public Object getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(Object releaseDate) {
        mReleaseDate = releaseDate;
    }

    public Long getRepostsCount() {
        return mRepostsCount;
    }

    public void setRepostsCount(Long repostsCount) {
        mRepostsCount = repostsCount;
    }

    public Object getSecretToken() {
        return mSecretToken;
    }

    public void setSecretToken(Object secretToken) {
        mSecretToken = secretToken;
    }

    public String getSharing() {
        return mSharing;
    }

    public void setSharing(String sharing) {
        mSharing = sharing;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public Boolean getStreamable() {
        return mStreamable;
    }

    public void setStreamable(Boolean streamable) {
        mStreamable = streamable;
    }

    public String getTagList() {
        return mTagList;
    }

    public void setTagList(String tagList) {
        mTagList = tagList;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
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

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

    public Long getUserId() {
        return mUserId;
    }

    public void setUserId(Long userId) {
        mUserId = userId;
    }

    public Object getVisuals() {
        return mVisuals;
    }

    public void setVisuals(Object visuals) {
        mVisuals = visuals;
    }

    public String getWaveformUrl() {
        return mWaveformUrl;
    }

    public void setWaveformUrl(String waveformUrl) {
        mWaveformUrl = waveformUrl;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "mArtworkUrl='" + mArtworkUrl + '\'' +
                ", mCaption=" + mCaption +
                ", mCommentCount=" + mCommentCount +
                ", mCommentable=" + mCommentable +
                ", mCreatedAt='" + mCreatedAt + '\'' +
                ", mDescription='" + ( ((mDescription !=null) ? (mDescription.length() < 10) ? mDescription : mDescription.substring(0,8) : "" ) )+ '\'' +
                ", mDisplayDate='" + mDisplayDate + '\'' +
                ", mDownloadCount=" + mDownloadCount +
                ", mDownloadable=" + mDownloadable +
                ", mDuration=" + mDuration +
                ", mEmbeddableBy='" + mEmbeddableBy + '\'' +
                ", mFullDuration=" + mFullDuration +
                ", mGenre='" + mGenre + '\'' +
                ", mHasDownloadsLeft=" + mHasDownloadsLeft +
                ", mId=" + mId +
                ", mKind='" + mKind + '\'' +
                ", mLabelName='" + mLabelName + '\'' +
                ", mLastModified='" + mLastModified + '\'' +
                ", mLicense='" + mLicense + '\'' +
                ", mLikesCount=" + mLikesCount +
                ", mMedia=" + mMedia +
                ", mMonetizationModel='" + mMonetizationModel + '\'' +
                ", mPermalink='" + mPermalink + '\'' +
                ", mPermalinkUrl='" + mPermalinkUrl + '\'' +
                ", mPlaybackCount=" + mPlaybackCount +
                ", mPolicy='" + mPolicy + '\'' +
                ", mPublic=" + mPublic +
                ", mPublisherMetadata=" + mPublisherMetadata +
                ", mPurchaseTitle=" + mPurchaseTitle +
                ", mPurchaseUrl=" + mPurchaseUrl +
                ", mReleaseDate=" + mReleaseDate +
                ", mRepostsCount=" + mRepostsCount +
                ", mSecretToken=" + mSecretToken +
                ", mSharing='" + mSharing + '\'' +
                ", mState='" + mState + '\'' +
                ", mStreamable=" + mStreamable +
                ", mTagList='" + mTagList + '\'' +
                ", mTitle='" + mTitle + '\'' +
                ", mUri='" + mUri + '\'' +
                ", mUrn='" + mUrn + '\'' +
                ", mUser=" + mUser +
                ", mUserId=" + mUserId +
                ", mVisuals=" + mVisuals +
                ", mWaveformUrl='" + mWaveformUrl + '\'' +
                '}';
    }
}

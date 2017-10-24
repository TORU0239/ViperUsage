package my.liewjuntung.daggerviperusage.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by toruchoi on 08/10/2017.
 */

public class InstagramItemModel {
    private String id;
    private String code;

    private UserModel user;

    private ImageModel images;

    @SerializedName("created_time")
    private long createdTime;

    @SerializedName("caption")
    private CaptionModel caption;

    @SerializedName("user_has_liked")
    private boolean HasUserLiked;

    @SerializedName("likes")
    private LikeModel likes;

    @SerializedName("comments")
    private CommentModel comments;

    @SerializedName("can_view_comments")
    private boolean canViewComments;

    @SerializedName("can_delete_comments")
    private boolean canDeleteComments;

    private String type;
    private String link;

    private LocationModel location;

    @SerializedName("alt_media_url")
    private String altMediaUrl;

    @SerializedName("carousel_media")
    private List<CarouselModel> carouselMedia;

    @SerializedName("videos")
    private VideoModel video;

    @SerializedName("video_views")
    private int videoViewsCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public ImageModel getImages() {
        return images;
    }

    public void setImages(ImageModel images) {
        this.images = images;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }

    public CaptionModel getCaption() {
        return caption;
    }

    public void setCaption(CaptionModel caption) {
        this.caption = caption;
    }

    public boolean isHasUserLiked() {
        return HasUserLiked;
    }

    public void setHasUserLiked(boolean hasUserLiked) {
        HasUserLiked = hasUserLiked;
    }

    public LikeModel getLikes() {
        return likes;
    }

    public void setLikes(LikeModel likes) {
        this.likes = likes;
    }

    public CommentModel getComments() {
        return comments;
    }

    public void setComments(CommentModel comments) {
        this.comments = comments;
    }

    public boolean isCanViewComments() {
        return canViewComments;
    }

    public void setCanViewComments(boolean canViewComments) {
        this.canViewComments = canViewComments;
    }

    public boolean isCanDeleteComments() {
        return canDeleteComments;
    }

    public void setCanDeleteComments(boolean canDeleteComments) {
        this.canDeleteComments = canDeleteComments;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public LocationModel getLocation() {
        return location;
    }

    public void setLocation(LocationModel location) {
        this.location = location;
    }

    public String getAltMediaUrl() {
        return altMediaUrl;
    }

    public void setAltMediaUrl(String altMediaUrl) {
        this.altMediaUrl = altMediaUrl;
    }

    public List<CarouselModel> getCarouselMedia() {
        return carouselMedia;
    }

    public void setCarouselMedia(List<CarouselModel> carouselMedia) {
        this.carouselMedia = carouselMedia;
    }

    public VideoModel getVideo() {
        return video;
    }

    public void setVideo(VideoModel video) {
        this.video = video;
    }

    public int getVideoViewsCount() {
        return videoViewsCount;
    }

    public void setVideoViewsCount(int videoViewsCount) {
        this.videoViewsCount = videoViewsCount;
    }
}

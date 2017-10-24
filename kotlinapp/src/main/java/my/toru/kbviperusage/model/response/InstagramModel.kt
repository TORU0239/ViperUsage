package my.toru.kbviperusage.model.response

import com.google.gson.annotations.SerializedName

/**
 * Created by toruchoi on 24/10/2017.
 */
data class InstagramItemModel(val id:String, val code:String, val user:UserModel, val images:ImageModel,
                              @SerializedName("created_time") val createdTime:Long, @SerializedName("caption") val caption:CaptionModel,
                              @SerializedName("user_has_liked") val hasUserLiked:Boolean, @SerializedName("likes") val likes:LikeModel,
                              @SerializedName("comments") val comments:CommentedModel, @SerializedName("can_view_comments") val canViewComments:Boolean,
                              @SerializedName("can_delete_comments") val canDeleteComments:Boolean, val type:String, val link:String, val location:LocationModel,
                              @SerializedName("alt_media_url") val altMediaUrl:String, @SerializedName("carousel_media") val carouselMedia:List<CarouselModel>,
                              @SerializedName("videos") val video:VideoModel, @SerializedName("video_views") val videoViews:Int)
data class CaptionModel(val id:Long,
                        val text:String,
                        @SerializedName("created_time") val createdTime:Long,
                        @SerializedName("from") val author:UserModel)

data class CarouselModel(val type:String, val images:ImageModel,
                        @SerializedName("users_in_photo") val usersInPhoto:ArrayList<UsersInPhotoModel>)

data class CommentEachModel(val id:Long, val text:String,
                            @SerializedName("created_time") val createdTime:Long,
                            @SerializedName("from") val commentedUser:UserModel)

data class CommentedModel(val data:ArrayList<CommentEachModel>, val count:Int)

data class LikeModel(@SerializedName("data") val likedUsersData:List<UserModel>, val count:Int)

data class LocationModel(val name:String)

data class UserModel(@SerializedName("full_name") val fullName:String,
                     @SerializedName("profile_picture") val profilePicture:String,
                     @SerializedName("username") val userName:String)

data class UsersInPhotoModel(val user:UserModel, val position:PostionModel)
data class PostionModel(@SerializedName("x") val locationX:Double, @SerializedName("y") val locationY:Double)

data class ImageDataBaseModel(val width:Int, val height:Int, val url:String)
data class ImageModel(@SerializedName("thumbnail") val thumbnail:ImageDataBaseModel,
                      @SerializedName("low_resolution") val lowResolution:ImageDataBaseModel,
                      @SerializedName("standard_resolution") val stdResolution:ImageDataBaseModel)

data class VideoModel(@SerializedName("standard_resolution") val stdResolution:ImageDataBaseModel,
                      @SerializedName("low_bandwidth") val lowBandwidthModel:ImageDataBaseModel,
                      @SerializedName("low_resolution") val lowResolutionMode:ImageDataBaseModel)
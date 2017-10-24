package my.liewjuntung.kotlindaggerapp.model.response

import com.google.gson.annotations.SerializedName

/**
 * Created by toruchoi on 24/10/2017.
 */
data class InstagramResponse(val items:List<InstagramItemModel>, @SerializedName("more_available") val more:Boolean, val status:String)
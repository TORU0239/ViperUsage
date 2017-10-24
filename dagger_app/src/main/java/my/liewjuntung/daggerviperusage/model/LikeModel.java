package my.liewjuntung.daggerviperusage.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by toruchoi on 08/10/2017.
 */

public class LikeModel {
    @SerializedName("data")
    private UserModel[] likedUsersData;
    private int count;

    public UserModel[] getLikedUsersData() {
        return likedUsersData;
    }

    public void setLikedUsersData(UserModel[] likedUsersData) {
        this.likedUsersData = likedUsersData;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

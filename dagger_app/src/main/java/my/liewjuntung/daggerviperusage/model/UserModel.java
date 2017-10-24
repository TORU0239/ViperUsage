package my.liewjuntung.daggerviperusage.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by toruchoi on 08/10/2017.
 */

public class UserModel {
    private String id;

    @SerializedName("full_name")
    private String fullName;

    @SerializedName("profile_picture")
    private String profilePicture;

    @SerializedName("username")
    private String userName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

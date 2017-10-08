package toru.io.my.viperusage.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by toruchoi on 08/10/2017.
 */

public class CarouselModel {
    private String type;
    private ImageModel images;

    @SerializedName("users_in_photo")
    private UsersInPhotoModel[] usersInPhoto;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ImageModel getImages() {
        return images;
    }

    public void setImages(ImageModel images) {
        this.images = images;
    }

    public UsersInPhotoModel[] getUsersInPhoto() {
        return usersInPhoto;
    }

    public void setUsersInPhoto(UsersInPhotoModel[] usersInPhoto) {
        this.usersInPhoto = usersInPhoto;
    }
}

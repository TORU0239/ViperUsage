package my.liewjuntung.daggerviperusage.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by toruchoi on 08/10/2017.
 */

public class ImageModel {
    @SerializedName("thumbnail")
    private ImageDataBaseModel thumbnailImage;

    @SerializedName("low_resolution")
    private ImageDataBaseModel lowResolution;

    @SerializedName("standard_resolution")
    private ImageDataBaseModel standardResolution;

    public ImageDataBaseModel getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(ImageDataBaseModel thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    public ImageDataBaseModel getLowResolution() {
        return lowResolution;
    }

    public void setLowResolution(ImageDataBaseModel lowResolution) {
        this.lowResolution = lowResolution;
    }

    public ImageDataBaseModel getStandardResolution() {
        return standardResolution;
    }

    public void setStandardResolution(ImageDataBaseModel standardResolution) {
        this.standardResolution = standardResolution;
    }
}

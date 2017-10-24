package my.liewjuntung.daggerviperusage.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by toruchoi on 08/10/2017.
 */

public class VideoModel {
    @SerializedName("standard_resolution")
    private ImageDataBaseModel standardResolutionModel;

    @SerializedName("low_bandwidth")
    private ImageDataBaseModel lowBandWidthModel;

    @SerializedName("low_resolution")
    private ImageDataBaseModel lowResolutionModel;

    public ImageDataBaseModel getStandardResolutionModel() {
        return standardResolutionModel;
    }

    public void setStandardResolutionModel(ImageDataBaseModel standardResolutionModel) {
        this.standardResolutionModel = standardResolutionModel;
    }

    public ImageDataBaseModel getLowBandWidthModel() {
        return lowBandWidthModel;
    }

    public void setLowBandWidthModel(ImageDataBaseModel lowBandWidthModel) {
        this.lowBandWidthModel = lowBandWidthModel;
    }

    public ImageDataBaseModel getLowResolutionModel() {
        return lowResolutionModel;
    }

    public void setLowResolutionModel(ImageDataBaseModel lowResolutionModel) {
        this.lowResolutionModel = lowResolutionModel;
    }
}

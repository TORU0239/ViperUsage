package toru.io.my.viperusage.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by toruchoi on 08/10/2017.
 */

public class PositionModel {
    @SerializedName("x")
    private double locationX;

    @SerializedName("y")
    private double locationY;

    public double getLocationX() {
        return locationX;
    }

    public void setLocationX(double locationX) {
        this.locationX = locationX;
    }

    public double getLocationY() {
        return locationY;
    }

    public void setLocationY(double locationY) {
        this.locationY = locationY;
    }
}

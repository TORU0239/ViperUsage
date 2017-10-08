package toru.io.my.viperusage.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by toruchoi on 08/10/2017.
 */

public class InstagramResponse {
    public List<InstagramItemModel> items;

    @SerializedName("more_available")
    public boolean moreAvailable;

    public String status;
}
package toru.io.my.viperusage.network.services;

import org.json.JSONObject;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import toru.io.my.viperusage.model.InstagramResponse;

/**
 * Created by toruchoi on 08/10/2017.
 */

public interface IServices {
    @GET("{filter}/media/")
    Observable<InstagramResponse> getService(@Path("filter") String filter,
                                             @Query("max_id") String maxId);
}
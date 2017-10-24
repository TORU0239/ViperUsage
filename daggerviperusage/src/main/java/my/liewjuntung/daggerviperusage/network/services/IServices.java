package my.liewjuntung.daggerviperusage.network.services;

import io.reactivex.Observable;
import my.liewjuntung.daggerviperusage.model.InstagramResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by toruchoi on 08/10/2017.
 */

public interface IServices {
    @GET("{filter}/media/")
    Observable<InstagramResponse> getService(@Path("filter") String filter,
                                             @Query("max_id") String maxId);
}
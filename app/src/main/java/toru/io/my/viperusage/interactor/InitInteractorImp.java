package toru.io.my.viperusage.interactor;

import android.util.Log;

import org.json.JSONObject;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import toru.io.my.viperusage.model.InstagramResponse;
import toru.io.my.viperusage.network.ApiBase;
import toru.io.my.viperusage.network.services.IServices;
import toru.io.my.viperusage.network.services.RequestModel;

/**
 * Created by toruchoi on 06/10/2017.
 */

public class InitInteractorImp implements InitInteractor{
    private static final String TAG = InitInteractorImp.class.getSimpleName();

    private InitInteractorOut out;

    public InitInteractorImp(InitInteractorOut out) {
        this.out = out;
    }

    @Override
    public void onGetResponse(RequestModel request) {
        Retrofit retrofit = ApiBase.getInstance("https://www.instagram.com/").getRetrofit();
        IServices services = retrofit.create(IServices.class);

        Log.w(TAG, "request:: id : " + request.id + ", maxid: " + request.maxId);

        services.getService(request.id, request.maxId)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .map(instagramResponse -> instagramResponse.items)
                .subscribe(instagramResponses -> {
                    out.onResponseSuccess(instagramResponses);
                }, throwable -> {
                    out.onResponseFailed(throwable);
                }, () -> {});
    }
}
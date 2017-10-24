package my.liewjuntung.daggerviperusage.interactor;

import android.util.Log;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import my.liewjuntung.daggerviperusage.network.ApiBase;
import my.liewjuntung.daggerviperusage.network.services.IServices;
import my.liewjuntung.daggerviperusage.network.services.RequestModel;
import retrofit2.Retrofit;
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
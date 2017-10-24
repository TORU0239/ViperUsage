package my.liewjuntung.daggerviperusage.interactor;

import android.util.Log;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import my.liewjuntung.daggerviperusage.network.services.IServices;
import my.liewjuntung.daggerviperusage.network.services.RequestModel;
import toru.io.my.bviper.interactor.BViperInteractorOut;

/**
 * Created by toruchoi on 06/10/2017.
 */

public class InitInteractorImp implements InitInteractor{
    private static final String TAG = InitInteractorImp.class.getSimpleName();
    private IServices services;

    @Inject
    public InitInteractorImp(IServices services) {
        this.services = services;
    }

    @Override
    public void onGetResponse(BViperInteractorOut out, RequestModel request) {

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
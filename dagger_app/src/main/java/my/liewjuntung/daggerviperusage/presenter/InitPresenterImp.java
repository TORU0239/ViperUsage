package my.liewjuntung.daggerviperusage.presenter;

import android.util.Log;

import java.util.List;

import javax.inject.Inject;

import my.liewjuntung.daggerviperusage.interactor.InitInteractor;
import my.liewjuntung.daggerviperusage.interactor.InitInteractorOut;
import my.liewjuntung.daggerviperusage.model.InstagramItemModel;
import my.liewjuntung.daggerviperusage.network.services.RequestModel;
import my.liewjuntung.daggerviperusage.view.InitView;


/**
 * Created by toruchoi on 06/10/2017.
 */

public class InitPresenterImp implements InitPresenter<RequestModel>, InitInteractorOut {
    private static final String TAG = InitPresenterImp.class.getSimpleName();
    private InitView view;
    private InitInteractor interactor;

    /**
     * interactor is injected from the outside
     * @param view
     * @param interactor
     */
    @Inject
    public InitPresenterImp(InitView view, InitInteractor interactor) {
        this.view = view;
        this.interactor = interactor;
    }

    // handling LifeCycle
    @Override
    public void onCreate() {}

    @Override
    public void onResume() {}

    @Override
    public void onPause() {}

    @Override
    public void onDestroy() {}

    // start fetching data from API
    @Override
    public void onUpdateStart(RequestModel requestModel) {
        Log.w(TAG, "onUpdateStart");
        interactor.onGetResponse(this, requestModel);
    }

    // View Update Part if successful
    @Override
    public void onResponseSuccess(List<InstagramItemModel> result) {
        view.onUpdate(result);
    }

    // Notice View if failed
    @Override
    public void onResponseFailed(Throwable throwable) {
        throwable.printStackTrace();
    }
}
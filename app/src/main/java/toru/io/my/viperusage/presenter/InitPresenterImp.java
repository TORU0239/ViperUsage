package toru.io.my.viperusage.presenter;

import android.util.Log;

import java.util.List;

import toru.io.my.viperusage.interactor.InitInteractorImp;
import toru.io.my.viperusage.interactor.InitInteractorOut;
import toru.io.my.viperusage.model.InstagramItemModel;
import toru.io.my.viperusage.network.services.RequestModel;
import toru.io.my.viperusage.view.InitView;

/**
 * Created by toruchoi on 06/10/2017.
 */

public class InitPresenterImp implements InitPresenter<RequestModel>, InitInteractorOut {
    private static final String TAG = InitPresenterImp.class.getSimpleName();
    private InitView view;
    private InitInteractorImp interactorImp;

    public InitPresenterImp(InitView v) {
        view = v;
        interactorImp = new InitInteractorImp(this);
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
        interactorImp.onGetResponse(requestModel);
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
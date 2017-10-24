package my.toru.kbviperusage.mvp

import my.toru.kbviperusage.model.requestmodel.RequestModel
import my.toru.kbviperusage.model.response.InstagramItemModel

/**
 * Created by toruchoi on 24/10/2017.
 */
class MainPresenterImp(private val view:MainView) : MainPresenter<RequestModel>, MainInteractorOut{
    override fun onResponseSuccess(result: List<InstagramItemModel>?) {
        result?.let {
            view.onUpdate(it)
        }
    }

    override fun onResponseFailed(throwable: Throwable?) {
        throwable?.printStackTrace()
    }

    private val interactor = MainInteractorImp(this)

    // for handling lifecycle of view. here, not used
    override fun onCreate() {}

    override fun onResume() {}

    override fun onPause() {}

    override fun onDestroy() {}

    // transmitting request parameter to interactor
    override fun updateStart(requestModel: RequestModel) {
        interactor.onGetResponse(requestModel)
    }
}

package my.liewjuntung.kotlindaggerapp.mvp

import my.liewjuntung.kotlindaggerapp.model.requestmodel.RequestModel
import my.liewjuntung.kotlindaggerapp.model.response.InstagramItemModel
import javax.inject.Inject

/**
 * Created by toruchoi on 24/10/2017.
 */
class MainPresenterImp @Inject constructor(val view:MainView, val interactor: MainInteractor) : MainPresenter<RequestModel>, MainInteractorOut{
    override fun onResponseSuccess(result: List<InstagramItemModel>?) {
        result?.let {
            view.onUpdate(it)
        }
    }

    override fun onResponseFailed(throwable: Throwable?) {
        throwable?.printStackTrace()
    }

    // private val interactor = MainInteractorImp(this)

    // for handling lifecycle of view. here, not used
    override fun onCreate() {}

    override fun onResume() {}

    override fun onPause() {}

    override fun onDestroy() {}

    // transmitting request parameter to interactor
    override fun updateStart(requestModel: RequestModel) {
        interactor.onGetResponse(this, requestModel)
    }
}

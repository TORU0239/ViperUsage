package my.toru.kbviperusage.mvp

import my.toru.kbviperusage.model.requestmodel.RequestModel
import my.toru.kbviperusage.model.response.InstagramResponse

/**
 * Created by toruchoi on 24/10/2017.
 */
class MainPresenterImp(val view:MainView) : MainPresenter<RequestModel>{
    private val interactor = MainInteractorImp(MainInteractorOutImp())

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

class MainInteractorOutImp : MainInteractorOut{
    override fun onResponseSuccess(result: InstagramResponse?) {}

    override fun onResponseFailed(throwable: Throwable?) {}
}
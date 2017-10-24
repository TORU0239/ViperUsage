package my.toru.kbviperusage.mvp

import my.toru.kbviperusage.model.requestmodel.RequestModel
import my.toru.kbviperusage.model.response.InstagramModel

/**
 * Created by toruchoi on 24/10/2017.
 */
class MainPresenterImp : MainPresenter<RequestModel>{
    companion object {
        val TAG : String? = MainPresenterImp::class.simpleName
    }

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
    override fun onResponseFailed(throwable: Throwable?) {}

    override fun onResponseSuccess(result: InstagramModel?) {}
}
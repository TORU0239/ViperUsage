package my.toru.kbviperusage.mvp

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import my.toru.kbviperusage.model.requestmodel.RequestModel
import my.toru.kbviperusage.network.ApiService
import my.toru.kbviperusage.network.IInstagramService

/**
 * Created by toruchoi on 24/10/2017.
 */
class MainInteractorImp(val out:MainInteractorOut) : MainInteractor {
    override fun onGetResponse(request: RequestModel?) {
        val retrofit = ApiService.initRetrofit("")

        retrofit.create(IInstagramService::class.java).getInstagramPost(request!!)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({ result -> out.onResponseSuccess(result)
                }, { error -> out.onResponseFailed(error) })
    }
}
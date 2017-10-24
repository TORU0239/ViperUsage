package my.toru.kbviperusage.mvp

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import my.toru.kbviperusage.model.requestmodel.RequestModel
import my.toru.kbviperusage.model.response.InstagramResponse
import my.toru.kbviperusage.network.ApiService
import my.toru.kbviperusage.network.IInstagramService

/**
 * Created by toruchoi on 24/10/2017.
 */
class MainInteractorImp(val out:MainInteractorOut) : MainInteractor {
    override fun onGetResponse(request: RequestModel?) {
        val retrofit = ApiService.initRetrofit("https://www.instagram.com")

        retrofit.create(IInstagramService::class.java).getInstagramPost(request!!.id, request.maxId)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .map { t: InstagramResponse -> t.items }
                .subscribe({ result -> out.onResponseSuccess(result)
                }, { error -> out.onResponseFailed(error) })
    }
}
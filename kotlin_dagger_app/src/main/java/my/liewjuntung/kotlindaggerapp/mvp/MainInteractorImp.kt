package my.liewjuntung.kotlindaggerapp.mvp

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import my.liewjuntung.kotlindaggerapp.model.requestmodel.RequestModel
import my.liewjuntung.kotlindaggerapp.model.response.InstagramItemModel
import my.liewjuntung.kotlindaggerapp.model.response.InstagramResponse
import my.liewjuntung.kotlindaggerapp.network.IInstagramService
import toru.io.my.bviper.interactor.BViperInteractorOut

/**
 * Created by toruchoi on 24/10/2017.
 */
class MainInteractorImp(val service: IInstagramService) : MainInteractor {
    override fun onGetResponse(out: BViperInteractorOut<List<InstagramItemModel>>, request: RequestModel) {
        service.getInstagramPost(request.id, request.maxId)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .map { t: InstagramResponse -> t.items }
                .subscribe({ result ->
                    out.onResponseSuccess(result)
                }, { error -> out.onResponseFailed(error) })
    }
}
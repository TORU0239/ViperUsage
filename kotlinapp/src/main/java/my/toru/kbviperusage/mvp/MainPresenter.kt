package my.toru.kbviperusage.mvp

import toru.io.my.bviper.presenter.BViperPresenter


/**
 * Created by toruchoi on 24/10/2017.
 */
interface MainPresenter<in T> : BViperPresenter{
    fun updateStart(requestModel:T)
}
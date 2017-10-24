package my.liewjuntung.kotlindaggerapp.mvp

import my.liewjuntung.kotlindaggerapp.model.requestmodel.RequestModel
import my.liewjuntung.kotlindaggerapp.model.response.InstagramItemModel
import toru.io.my.bviper.interactor.AltBViperInteractor
import toru.io.my.bviper.interactor.BViperInteractorOut

/**
 * Created by toruchoi on 24/10/2017.
 * get http response via interactor.
 */

interface MainInteractor : AltBViperInteractor<List<InstagramItemModel>, RequestModel>
interface MainInteractorOut : BViperInteractorOut<List<InstagramItemModel>>
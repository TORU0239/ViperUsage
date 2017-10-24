package my.toru.kbviperusage.mvp

import my.toru.kbviperusage.model.requestmodel.RequestModel
import my.toru.kbviperusage.model.response.InstagramModel
import toru.io.my.bviper.interactor.BViperInteractor
import toru.io.my.bviper.interactor.BViperInteractorOut

/**
 * Created by toruchoi on 24/10/2017.
 * get http response via interactor.
 */

interface MainInteractor : BViperInteractor<RequestModel>
interface MainInteractorOut : BViperInteractorOut<InstagramModel>
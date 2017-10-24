package my.liewjuntung.kotlindaggerapp.ui

import android.support.v7.widget.LinearLayoutManager
import dagger.Module
import dagger.Provides
import my.liewjuntung.kotlindaggerapp.MainActivity
import my.liewjuntung.kotlindaggerapp.model.requestmodel.RequestModel
import my.liewjuntung.kotlindaggerapp.mvp.*
import my.liewjuntung.kotlindaggerapp.network.IInstagramService
import javax.inject.Named

/**
 * Created by pandawarrior on 24/10/2017.
 */
// my.liewjuntung.kotlindaggerapp.model.requestmodel.RequestModel
@Module
class MainModule {
    @Provides
    fun providesInitActivity(activity: MainActivity): MainView = activity

    @Provides
    fun providesMainInteractor(iServices: IInstagramService): MainInteractor = MainInteractorImp(iServices)

    @Provides
    fun providesMainPresenter(mainView: MainView, mainInteractor: MainInteractor): MainPresenter<RequestModel> = MainPresenterImp(mainView, mainInteractor)

    @Provides
    fun providesInitViewAdapter(): MainInstaAdapter = MainInstaAdapter()

    @Provides
    fun providesLinearLayoutManager(activity: MainActivity): LinearLayoutManager = LinearLayoutManager(activity)

    @Provides
    @Named("toru")
    fun providesToruRequestModel(): RequestModel = RequestModel("toru_0239", "0")

    @Provides
    @Named("kevin")
    fun providesKevinRequestModel(): RequestModel = RequestModel("s1lv3rd3m0n", "0")

}

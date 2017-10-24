package my.liewjuntung.daggerviperusage.view;

import dagger.Module;
import dagger.Provides;
import my.liewjuntung.daggerviperusage.interactor.InitInteractor;
import my.liewjuntung.daggerviperusage.interactor.InitInteractorImp;
import my.liewjuntung.daggerviperusage.network.services.IServices;
import my.liewjuntung.daggerviperusage.network.services.RequestModel;
import my.liewjuntung.daggerviperusage.presenter.InitPresenter;
import my.liewjuntung.daggerviperusage.presenter.InitPresenterImp;

/**
 * Created by pandawarrior on 24/10/2017.
 */
@Module
public class InitModule {
    @Provides
    public InitView providesInitActivity(InitActivity initActivity){
        return initActivity;
    }

    @Provides
    public InitInteractor providesInitInteractor(IServices iServices){
        return new InitInteractorImp(iServices);
    }

    @Provides
    public InitPresenter<RequestModel> providesInitPresenter(InitView initView, InitInteractor initInteractor){
        return new InitPresenterImp(initView, initInteractor);
    }
}

package my.liewjuntung.daggerviperusage.view;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.LinearLayoutManager;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import my.liewjuntung.daggerviperusage.R;
import my.liewjuntung.daggerviperusage.databinding.ActivityInitBinding;
import my.liewjuntung.daggerviperusage.interactor.InitInteractor;
import my.liewjuntung.daggerviperusage.interactor.InitInteractorImp;
import my.liewjuntung.daggerviperusage.network.services.IServices;
import my.liewjuntung.daggerviperusage.network.services.RequestModel;
import my.liewjuntung.daggerviperusage.presenter.InitPresenter;
import my.liewjuntung.daggerviperusage.presenter.InitPresenterImp;
import my.liewjuntung.daggerviperusage.view.ui.InitViewAdapter;

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

    @Provides
    public InitViewAdapter providesInitViewAdapter(){
        return new InitViewAdapter();
    }

    @Provides
    public LinearLayoutManager providesLinearLayoutManager(InitActivity activity){
        return new LinearLayoutManager(activity);
    }

    @Provides
    @Named("toru")
    public RequestModel providesToruRequestModel(){
        RequestModel model = new RequestModel();
        model.id = "toru_0239";
        model.maxId = "0";
        return model;
    }

    @Provides
    @Named("kevin")
    public RequestModel providesJTRequestModel(){
        RequestModel model = new RequestModel();
        model.id = "s1lv3rd3m0n";
        model.maxId = "0";
        return model;
    }

    @Provides
    public ActivityInitBinding providesActivityBinding(InitActivity activity){
        return DataBindingUtil.setContentView(activity, R.layout.activity_init);
    }
}

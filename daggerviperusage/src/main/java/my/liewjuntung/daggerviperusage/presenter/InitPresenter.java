package my.liewjuntung.daggerviperusage.presenter;

import toru.io.my.bviper.presenter.BViperPresenter;

/**
 * Created by toruchoi on 06/10/2017.
 */

public interface InitPresenter<T> extends BViperPresenter {
    // only handling UI with Presenter
    void onUpdateStart(T requestModel);
}
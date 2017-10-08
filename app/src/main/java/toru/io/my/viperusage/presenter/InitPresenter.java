package toru.io.my.viperusage.presenter;

import toru.io.my.bviper.presenter.MvpPresenter;

/**
 * Created by toruchoi on 06/10/2017.
 */

public interface InitPresenter<T> extends MvpPresenter {
    // only handling UI with Presenter
    void onUpdateStart(T requestModel);
}
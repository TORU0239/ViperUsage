package toru.io.my.bviper.presenter;

/**
 * Created by toruchoi on 08/10/2017.
 */

public interface MvpPresenter {
    // handling LifeCycle
    void onCreate();
    void onResume();
    void onPause();
    void onDestroy();
}
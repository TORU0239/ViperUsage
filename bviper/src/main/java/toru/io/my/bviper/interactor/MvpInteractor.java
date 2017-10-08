package toru.io.my.bviper.interactor;

/**
 * Created by toruchoi on 08/10/2017.
 */

public interface MvpInteractor<T> {
    // handling business logic and fetching datas from API or DataBase.
    void onGetResponse(T request);
}
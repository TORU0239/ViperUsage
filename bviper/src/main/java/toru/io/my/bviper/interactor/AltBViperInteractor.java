package toru.io.my.bviper.interactor;

/**
 * Created by toruchoi on 08/10/2017.
 */

public interface AltBViperInteractor<T> {
    // handling business logic and fetching datas from API or DataBase.
    // It's better to put interactor interface in so that we take advantage of using dagger to inject
    // interactors to presenters
    void onGetResponse(BViperInteractorOut out, T request);
}
package toru.io.my.bviper.interactor;

public interface AltBViperInteractor<V, T> {
    // handling business logic and fetching datas from API or DataBase.
    // It's better to put interactor interface in so that we take advantage of using dagger to inject
    // interactors to presenters
    void onGetResponse(BViperInteractorOut<V> out, T request);
}
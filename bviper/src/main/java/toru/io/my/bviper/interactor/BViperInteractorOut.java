package toru.io.my.bviper.interactor;

/**
 * Created by toruchoi on 08/10/2017.
 */

public interface BViperInteractorOut<T> {
    void onResponseSuccess(T result);
    void onResponseFailed(Throwable throwable);
}
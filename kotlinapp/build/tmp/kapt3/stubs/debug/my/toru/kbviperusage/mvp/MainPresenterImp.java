package my.toru.kbviperusage.mvp;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lmy/toru/kbviperusage/mvp/MainPresenterImp;", "Lmy/toru/kbviperusage/mvp/MainPresenter;", "Lmy/toru/kbviperusage/model/requestmodel/RequestModel;", "Lmy/toru/kbviperusage/mvp/MainInteractorOut;", "view", "Lmy/toru/kbviperusage/mvp/MainView;", "(Lmy/toru/kbviperusage/mvp/MainView;)V", "interactor", "Lmy/toru/kbviperusage/mvp/MainInteractorImp;", "onCreate", "", "onDestroy", "onPause", "onResponseFailed", "throwable", "", "onResponseSuccess", "result", "", "Lmy/toru/kbviperusage/model/response/InstagramItemModel;", "onResume", "updateStart", "requestModel", "kotlinapp_debug"})
public final class MainPresenterImp implements my.toru.kbviperusage.mvp.MainPresenter<my.toru.kbviperusage.model.requestmodel.RequestModel>, my.toru.kbviperusage.mvp.MainInteractorOut {
    private final my.toru.kbviperusage.mvp.MainInteractorImp interactor = null;
    private final my.toru.kbviperusage.mvp.MainView view = null;
    
    @java.lang.Override()
    public void onResponseSuccess(@org.jetbrains.annotations.Nullable()
    java.util.List<my.toru.kbviperusage.model.response.InstagramItemModel> result) {
    }
    
    @java.lang.Override()
    public void onResponseFailed(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void updateStart(@org.jetbrains.annotations.NotNull()
    my.toru.kbviperusage.model.requestmodel.RequestModel requestModel) {
    }
    
    public MainPresenterImp(@org.jetbrains.annotations.NotNull()
    my.toru.kbviperusage.mvp.MainView view) {
        super();
    }
}
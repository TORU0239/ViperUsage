package my.toru.kbviperusage.network;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lmy/toru/kbviperusage/network/IInstagramService;", "", "getInstagramPost", "Lio/reactivex/Single;", "Lmy/toru/kbviperusage/model/response/InstagramResponse;", "filter", "", "maxId", "kotlinapp_debug"})
public abstract interface IInstagramService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "{filter}/media/")
    public abstract io.reactivex.Single<my.toru.kbviperusage.model.response.InstagramResponse> getInstagramPost(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "filter")
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "max_id")
    java.lang.String maxId);
}
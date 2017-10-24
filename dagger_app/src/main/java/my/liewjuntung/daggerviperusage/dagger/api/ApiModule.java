package my.liewjuntung.daggerviperusage.dagger.api;

import java.util.concurrent.TimeUnit;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import my.liewjuntung.daggerviperusage.network.services.IServices;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by pandawarrior on 24/10/2017.
 */
@Module
public class ApiModule {
    @Singleton
    @Provides
    public OkHttpClient providesOkHttpClient() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return new OkHttpClient.Builder()
                .connectTimeout(5000, TimeUnit.MILLISECONDS)
                .readTimeout(5000, TimeUnit.MILLISECONDS)
                .writeTimeout(5000, TimeUnit.MILLISECONDS)
                .addInterceptor(loggingInterceptor)
                .build();
    }

    @Singleton
    @Provides
    public Retrofit.Builder providesRetrofitBuilder(OkHttpClient client) {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create());
    }

    @Singleton
    @Provides
    @Named("instagram")
    public Retrofit providesInstagramRetrofit(Retrofit.Builder builder) {
        return builder
                .baseUrl("https://www.instagram.com/")
                .build();
    }

    @Singleton
    @Provides
    public IServices providesIService(@Named("instagram") Retrofit retrofit) {
        return retrofit.create(IServices.class);
    }
}



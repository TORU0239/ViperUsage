package my.liewjuntung.daggerviperusage.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by toruchoi on 08/10/2017.
 */

public class ApiBase {
    private static final String TAG = ApiBase.class.getSimpleName();

    private static ApiBase instance;
    private Retrofit retrofit;

    private ApiBase(String baseUrl){
        initWithBaseUrl(baseUrl);
    }

    public static ApiBase getInstance(String baseUrl){
        if(instance == null){
            instance = new ApiBase(baseUrl);
        }
        return instance;
    }

    private void initWithBaseUrl(String baseUrl){
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(5000, TimeUnit.MILLISECONDS)
                .readTimeout(5000, TimeUnit.MILLISECONDS)
                .writeTimeout(5000, TimeUnit.MILLISECONDS)
                .addInterceptor(loggingInterceptor)
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public Retrofit getRetrofit(){
        return retrofit;
    }
}
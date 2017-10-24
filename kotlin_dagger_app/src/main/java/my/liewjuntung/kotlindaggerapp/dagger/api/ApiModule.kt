package my.liewjuntung.kotlindaggerapp.dagger.api

import dagger.Module
import dagger.Provides
import my.liewjuntung.kotlindaggerapp.network.IInstagramService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by pandawarrior on 24/10/2017.
 */
@Module
class ApiModule {
    @Singleton
    @Provides
    fun providesOkHttpClient(): OkHttpClient {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        return OkHttpClient.Builder()
                .connectTimeout(5000, TimeUnit.MILLISECONDS)
                .readTimeout(5000, TimeUnit.MILLISECONDS)
                .writeTimeout(5000, TimeUnit.MILLISECONDS)
                .addInterceptor(loggingInterceptor)
                .build()
    }

    @Singleton
    @Provides
    fun providesRetrofitBuilder(client: OkHttpClient): Retrofit.Builder {
        return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
    }

    @Singleton
    @Provides
    @Named("instagram")
    fun providesInstagramRetrofit(builder: Retrofit.Builder): Retrofit {
        return builder
                .baseUrl("https://www.instagram.com/")
                .build()
    }

    @Singleton
    @Provides
    fun providesIService(@Named("instagram") retrofit: Retrofit): IInstagramService {
        return retrofit.create<IInstagramService>(IInstagramService::class.java)
    }
}



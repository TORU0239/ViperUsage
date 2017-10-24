package my.liewjuntung.kotlindaggerapp.network

import io.reactivex.Single
import my.liewjuntung.kotlindaggerapp.model.response.InstagramResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import java.util.concurrent.TimeUnit

/**
 * Created by toruchoi on 24/10/2017.
 *
 * Initialize Retrofit and RxJava
 */
object ApiService {

    fun initRetrofit(baseUrl:String) : Retrofit{
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        val client = OkHttpClient.Builder()
                        .connectTimeout(5000, TimeUnit.MILLISECONDS)
                        .readTimeout(5000, TimeUnit.MILLISECONDS)
                        .writeTimeout(5000, TimeUnit.MILLISECONDS)
                        .addInterceptor(loggingInterceptor)
                        .build()

        return Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .build()
    }
}

interface IInstagramService{
    @GET("{filter}/media/")
    fun getInstagramPost(@Path("filter") filter:String,
                         @Query("max_id") maxId:String):Single<InstagramResponse>
}
package my.liewjuntung.kotlindaggerapp.app

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import my.liewjuntung.daggerviperusage.dagger.DaggerAppComponent
import javax.inject.Inject

/**
 * Created by pandawarrior on 24/10/2017.
 */
class ViperUsageApplication: Application(), HasActivityInjector {
    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> {
        return androidInjector
    }

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent
                .builder()
                .application(this)
                .build()
                .inject(this)
    }
}
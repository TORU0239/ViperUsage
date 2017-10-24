package my.liewjuntung.daggerviperusage.app;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import my.liewjuntung.daggerviperusage.dagger.DaggerAppComponent;

/**
 * Created by toruchoi on 06/10/2017.
 */

public class ViperUsageApplication extends Application implements HasActivityInjector {
    private static final String TAG = ViperUsageApplication.class.getSimpleName();

    @Inject
    DispatchingAndroidInjector<Activity> androidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent
                .builder()
                .application(this)
                .build()
                .inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return androidInjector;
    }
}
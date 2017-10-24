package my.liewjuntung.daggerviperusage.dagger;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pandawarrior on 24/10/2017.
 */
@Module
public class AppModule {

    /**
     * Provides application level context
     * @param application
     * @return
     */
    @Provides
    @Singleton
    public Context provideContext(Application application) {
        return application;
    }
}

package my.liewjuntung.kotlindaggerapp.dagger

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by pandawarrior on 24/10/2017.
 */
@Module
class AppModule {

    /**
     * Provides application level context
     * @param application
     * @return
     */
    @Provides
    @Singleton
    fun provideContext(application: Application): Context {
        return application
    }
}

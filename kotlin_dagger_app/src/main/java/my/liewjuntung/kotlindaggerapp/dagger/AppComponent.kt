package my.liewjuntung.daggerviperusage.dagger

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import my.liewjuntung.kotlindaggerapp.app.ViperUsageApplication
import my.liewjuntung.kotlindaggerapp.dagger.ActivityBuilder
import my.liewjuntung.kotlindaggerapp.dagger.AppModule
import my.liewjuntung.kotlindaggerapp.dagger.api.ApiModule
import javax.inject.Singleton

/**
 * Created by pandawarrior on 24/10/2017.
 */
@Singleton
@Component(modules = arrayOf(AndroidInjectionModule::class, AppModule::class, ActivityBuilder::class, ApiModule::class))
interface AppComponent {

    @Component.Builder
    interface Builder {
        fun build(): AppComponent
        @BindsInstance
        fun application(application: Application): Builder
    }

    /**
     * Create an interface for [my.liewjuntung.kotlindaggerapp.app.ViperUsageApplication] to be injected
     */
    fun inject(application: ViperUsageApplication)

}

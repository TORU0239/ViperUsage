package my.liewjuntung.daggerviperusage.dagger;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import my.liewjuntung.daggerviperusage.app.ViperUsageApplication;

/**
 * Created by pandawarrior on 24/10/2017.
 */
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent {

    @Component.Builder interface Builder {
        AppComponent build();
        @BindsInstance
        Builder application(Application application);

    }
    /**
     * Create an interface for {@link my.liewjuntung.daggerviperusage.app.ViperUsageApplication} to be injected
     */
    void inject(ViperUsageApplication application);

}

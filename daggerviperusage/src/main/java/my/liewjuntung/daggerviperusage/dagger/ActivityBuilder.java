package my.liewjuntung.daggerviperusage.dagger;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import my.liewjuntung.daggerviperusage.view.InitActivity;
import my.liewjuntung.daggerviperusage.view.InitModule;

/**
 * Created by pandawarrior on 24/10/2017.
 */
@Module
public abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = {InitModule.class})
    public abstract InitActivity bindInitActivity();
}

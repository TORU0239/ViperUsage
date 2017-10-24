package my.liewjuntung.kotlindaggerapp.dagger;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import my.liewjuntung.kotlindaggerapp.MainActivity;
import my.liewjuntung.kotlindaggerapp.ui.MainModule;

/**
 * Created by pandawarrior on 24/10/2017.
 */
@Module
public abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = {MainModule.class})
    public abstract MainActivity bindMainActivity();
}

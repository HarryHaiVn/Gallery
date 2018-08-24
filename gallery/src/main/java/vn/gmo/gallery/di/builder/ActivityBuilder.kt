package vn.gmo.gallery.di.builder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import vn.gmo.gallery.di.module.FragmentBuildersModule
import vn.gmo.gallery.ui.main.MainActivity

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributeMainActivity(): MainActivity
}

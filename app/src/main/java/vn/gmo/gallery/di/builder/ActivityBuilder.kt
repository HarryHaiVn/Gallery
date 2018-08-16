package vn.gmo.gallery.di.builder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import vn.gmo.gallery.di.module.HomeModule
import vn.gmo.gallery.ui.activity.MainActivity

@Module
internal abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [HomeModule::class])
    internal abstract fun contributeMainInjector(): MainActivity
}
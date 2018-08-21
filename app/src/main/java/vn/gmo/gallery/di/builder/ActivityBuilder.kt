package vn.gmo.gallery.di.builder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import vn.gmo.gallery.ui.splash.SplashActivity
import vn.gmo.gallery.di.module.SplashActivityModule

@Module
internal abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [SplashActivityModule::class])
    internal abstract fun bindSplashActivity(): SplashActivity
}
package vn.gmo.gallery.di.builder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import vn.gmo.gallery.di.module.MainActivityModule
import vn.gmo.gallery.di.module.SplashActivityModule
import vn.gmo.gallery.ui.activity.MainActivity
import vn.gmo.gallery.ui.activity.SplashActivity

@Module
internal abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    internal abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [SplashActivityModule::class])
    internal abstract fun bindSplashActivty(): SplashActivity
}
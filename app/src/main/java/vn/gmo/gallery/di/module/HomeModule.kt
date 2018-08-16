package vn.gmo.gallery.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import vn.gmo.gallery.ui.fragment.HomeFragment

@Module
internal abstract class HomeModule {
    @ContributesAndroidInjector
    internal abstract fun contributeHomeFragmentInjector(): HomeFragment
}
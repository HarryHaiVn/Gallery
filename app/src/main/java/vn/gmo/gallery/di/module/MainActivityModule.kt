package vn.gmo.gallery.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import vn.gmo.gallery.ui.fragment.PictureFragment

@Module
internal abstract class MainActivityModule {
    @ContributesAndroidInjector
    internal abstract fun contributeHomeFragmentInjector(): PictureFragment
}